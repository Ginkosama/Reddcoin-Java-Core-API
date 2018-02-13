package com.reddcoin.core.models;

import java.io.Serializable;

public class NetTotalResponse implements Serializable
{
    private int totalbytesrecv;
    private int totalbytessent;
    private long timemillis;

    public int getTotalbytesreceived() {
        return totalbytesrecv;
    }

    public void setTotalbytesreceived(int totalbytesreceived) {
        this.totalbytesrecv = totalbytesreceived;
    }

    public int getTotalbytessent() {
        return totalbytessent;
    }

    public void setTotalbytessent(int totalbytessent) {
        this.totalbytessent = totalbytessent;
    }

    public long getTimemilliseconds() {
        return timemillis;
    }

    public void setTimemilliseconds(long timemilliseconds) {
        this.timemillis = timemilliseconds;
    }
}
