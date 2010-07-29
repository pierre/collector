#
# Copyright 2010 Ning, Inc.
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

import time

from scribe import scribe
from thrift.transport import TTransport, TSocket
from thrift.protocol import TBinaryProtocol

NB_MSGS = 20

transportOut = TTransport.TMemoryBuffer()
protocolOut = TBinaryProtocol.TBinaryProtocol(transportOut)

timeInMilliSinceEpoch = int(time.time()) * 1000
logEntry = scribe.LogEntry("hello", str(timeInMilliSinceEpoch) + ":world")

socket = TSocket.TSocket(host='127.0.0.1', port=7911)
transport = TTransport.TFramedTransport(socket)
protocol = TBinaryProtocol.TBinaryProtocol(trans=transport, strictRead=False, strictWrite=False)
client = scribe.Client(iprot=protocol, oprot=protocol)

transport.open()
i=0
print "Number of messages sent: ",
while i < NB_MSGS:
    result = client.Log(messages=[logEntry])
    print i, "..",
    i+=1
transport.close()
