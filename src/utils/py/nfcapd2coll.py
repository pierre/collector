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

#
# Send NetFlow data.
#
# Periodically, every 5 minutes by default, nfcapd will rename the current
# file (nfcad.current.<pid>) to nfcapd.%i%02i%02i%02i%02i (year/month/day/hour/minute).
# We look for these files, and send them to Scribe or collector.
#
# A ramfs is strongly encouraged for the data output directory (-l option):
#
#  mkfs -q /dev/ram1 8589934592  # 8 GB
#  mkdir -p /mnt/nfdump
#  mount /dev/ram1 /mnt/nfdump
#


import argparse
import base64
import glob
import logging
import os
import socket
import sys
import time

from scribe import scribe
import thrift
from thrift.transport import TTransport, TSocket
from thrift.protocol import TBinaryProtocol

#from netflow.ttypes import NetFlow


log = logging.getLogger('nfcapd2coll')

def generate_netflow_events_from_dumps(directory):
    """Given a directory of nfcapd files, create events for all rotated files
    (not current one).
    Parsed files are deleted.

    Keyword arguments:
    directory -- directory containing dumps

    """
    events = []
    # The files look like nfcapd.201011021335
    for file in glob.glob(os.path.join(directory, 'nfcapd.????????????')):
        events.extend(parse_data(file))
        # XXX DELETE

    log.info('Parsed %s, created %d events', directory, len(events))
    return events


def parse_data(file):
    """Given an ASCII file produced by nfcapd, create the associated events

    Keyword arguments:
    file -- file path to parse

    """
    events = []

    log.info('Parsed %s, created %d events', file, len(events))
    return events


def create_event(msgDate):
    """Create Netflow event from a dump line

    Keyword arguments:

    """
    transportOut = TTransport.TMemoryBuffer()
    protocolOut = TBinaryProtocol.TBinaryProtocol(transportOut)

    timeInMilliSinceEpoch = msgDate * 1000

    netflow = NetFlow(timeInMilliSinceEpoch)
    netflow.write(protocolOut)
    netflowInBytes = transportOut.getvalue()
    log.debug('Created: %s', str(netflow))

    return scribe.LogEntry("NetFlow", str(timeInMilliSinceEpoch) + ":" + base64.b64encode(netflowInBytes))


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
    result = client.Log(messages=events)
    transport.close()

    return result

def main(argv=None):
    handler = logging.StreamHandler(sys.stdout)
    log.setLevel(logging.DEBUG)
    log.addHandler(handler)
    log.debug('Logging handler configured')

    if argv is None:
        argv = sys.argv

    parser = argparse.ArgumentParser(description='Extract Netflow events from nfcapd dumps and forward them remotely to Scribe.')
    parser.add_argument('--directory', required=True, help='Directory of files to parse')
    args = parser.parse_args()

    try:
        events = generate_netflow_events_from_dumps(args.directory)
        #send_events(events, args.scribeHost, int(args.scribePort))
    except thrift.transport.TTransport.TTransportException, err:
        log.error('Unable to connect to Scribe: %s', err)

if __name__ == "__main__":
    sys.exit(main())
