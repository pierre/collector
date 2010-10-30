package com.ning.metrics.collector.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIp
{
    @Test(groups = "fast")
    public void testIntToIp() throws Exception
    {
        Assert.assertEquals(Ip.intToIp(-1), "255.255.255.255");
        Assert.assertEquals(Ip.intToIp(0), "0.0.0.0");
        Assert.assertEquals(Ip.intToIp(0x7F103401), "127.16.52.1");
    }

    @Test(groups = "fast")
    public void testIpToString() throws Exception
    {
        Assert.assertEquals(Ip.ipToInt("255.255.255.255"), -1);
        Assert.assertEquals(Ip.ipToInt("0.0.0.0"), 0);
        Assert.assertEquals(Ip.ipToInt("127.16.52.1"), 0x7F103401);
    }
}
