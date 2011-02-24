#
# Copyright 2011 Ning, Inc.
#
# Ning licenses this file to you under the Apache License, version 2.0
# (the "License"); you may not use this file except in compliance with the
# License.  You may obtain a copy of the License at:
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
# License for the specific language governing permissions and limitations
# under the License.
#
# Simple script to test the Thrift endpoint of the collector
#

import argparse
import base64
import imaplib
import logging
import rfc822
import socket
import StringIO
import sys
import time

from scribe import scribe
from thrift.transport import TTransport, TSocket
from thrift.protocol import TBinaryProtocol

from opsAlert.ttypes import OpsAlert


log = logging.getLogger('imap2coll')

def get_messages(host, user, password):
    """Download all messages (e.g. pages) from the mailbox

    Keyword arguments:
    host -- IMAP server
    user -- login connection information
    password -- password connection information

    See http://stackoverflow.com/questions/315362/properly-formatted-example-for-python-imap-email-access
    """
    M = imaplib.IMAP4_SSL(host)
    M.login(user, password)

    M.select()
    typ, data = M.search(None, 'UNSEEN')
    messages = []
    for num in data[0].split():
        typ, data = M.fetch(num, '(RFC822)')
        file = StringIO.StringIO(data[0][1])
        message = rfc822.Message(file)

        msgDate = time.mktime(rfc822.parsedate(message['date']))
        messages.append(create_event('IMAP',
                                      message['from'],
                                      message['to'],
                                      message['subject'],
                                      int(msgDate)))
    M.close()

    M.logout()

    log.info('Found %d unseen messages at %s', len(messages), host)
    return messages


def create_event(src, msgFrom, msgTo, msgSubject, msgDate):
    """Create Thrift event from a message

    Keyword arguments:
    src -- unique identifier for the source of the page (e.g. Nagios, Pages, ...)
    msgFrom -- email FROM header
    msgTo -- email TO header
    msgSubject -- email subject
    msgDate -- time when the message was received (seconds since epoch)

    """
    transportOut = TTransport.TMemoryBuffer()
    protocolOut = TBinaryProtocol.TBinaryProtocol(transportOut)

    timeInMilliSinceEpoch = msgDate * 1000

    opsAlert = OpsAlert(src, msgFrom, msgTo, msgSubject, timeInMilliSinceEpoch)
    opsAlert.write(protocolOut)
    opsAlertInBytes = transportOut.getvalue()
    log.debug('Created: %s', str(opsAlert))

    return scribe.LogEntry("OpsAlert", str(timeInMilliSinceEpoch) + ":" + base64.b64encode(opsAlertInBytes))


def send_events(events, scribeHost, scribePort):
    """Send all specified events

    Keyword arguments:
    events -- list of LogEntry events to send
    scribeHost -- Scribe server to talk to
    scribePort -- Scribe server's port

    """
    socket = TSocket.TSocket(host=scribeHost, port=scribePort)
    transport = TTransport.TFramedTransport(socket)
    protocol = TBinaryProtocol.TBinaryProtocol(trans=transport, strictRead=False, strictWrite=False)
    client = scribe.Client(iprot=protocol, oprot=protocol)

    transport.open()
    log.info('Sending %d messages to %s:%d', len(events), scribeHost, scribePort)
    result = client.Log(messages=[logEntry])
    transport.close()

    return result

def main(argv=None):
    handler = logging.StreamHandler(sys.stdout)
    log.setLevel(logging.DEBUG)
    log.addHandler(handler)
    log.debug('Logging handler configured')

    if argv is None:
        argv = sys.argv

    parser = argparse.ArgumentParser(description='Get pages from an IMAP mailbox and forward them remotely to Scribe.')
    parser.add_argument('--imapServer', required=True, help='IMAP server to connect to')
    parser.add_argument('--imapUsername', required=True, help='IMAP username')
    parser.add_argument('--imapPassword', required=True, help='IMAP password')
    parser.add_argument('--scribeHost', required=True, help='Scribe server to connect to')
    parser.add_argument('--scribePort', required=True, help='Scribe port')
    args = parser.parse_args()

    try:
        get_messages(args.imapServer, args.imapUsername, args.imapPassword)
    except socket.error, err:
        log.error('Unable to connect to the IMAP server: %s', err)

if __name__ == "__main__":
    sys.exit(main())
