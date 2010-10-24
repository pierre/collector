package com.ning.metrics.collector;

public class TestStandaloneServer
{
    public static void main(String[] args) throws Exception
    {
        System.setProperty("collector.activemq.enabled", "false");
        //TODO
        //System.setProperty("collector.spool.synctype", "SYNC");
        // We exercise only processing of the incoming events, not the Hadoop flusher
        System.setProperty("collector.diskspool.enabled", "false");
        System.setProperty("xn.hadoop.host", "file:///127.0.0.1:9000/tmp");

        StandaloneCollectorServer.main();
    }
}
