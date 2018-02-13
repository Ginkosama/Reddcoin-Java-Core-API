package com.reddcoin.core.models;

import java.io.Serializable;

public class PeerInfoResponse implements Serializable
{
    private String addr;
    private String services;
    private int lastsend;
    private int lastrecv;
    private int bytessent;
    private int bytesrecv;
    private int conntime;
    private float pingtime;
    private int version;
    private String subver;
    private boolean inbound;
    private int startingheight;
    private int banscore;
    private boolean syncnode;

    public String getAddress() {
        return addr;
    }

    public void setAddress(String address) {
        this.addr = address;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public int getLastsend() {
        return lastsend;
    }

    public void setLastsend(int lastsend) {
        this.lastsend = lastsend;
    }

    public int getLastreceived() {
        return lastrecv;
    }

    public void setLastreceived(int lastreceived) {
        this.lastrecv = lastreceived;
    }

    public int getBytessent() {
        return bytessent;
    }

    public void setBytessent(int bytessent) {
        this.bytessent = bytessent;
    }

    public int getBytesreceived() {
        return bytesrecv;
    }

    public void setBytesreceived(int bytesreceived) {
        this.bytesrecv = bytesreceived;
    }

    public int getConnectiontime() {
        return conntime;
    }

    public void setConnectiontime(int connectiontime) {
        this.conntime = connectiontime;
    }

    public float getPingtime() {
        return pingtime;
    }

    public void setPingtime(float pingtime) {
        this.pingtime = pingtime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getSubversion() {
        return subver;
    }

    public void setSubversion(String subversion) {
        this.subver = subversion;
    }

    public boolean isInbound() {
        return inbound;
    }

    public void setInbound(boolean inbound) {
        this.inbound = inbound;
    }

    public int getStartingheight() {
        return startingheight;
    }

    public void setStartingheight(int startingheight) {
        this.startingheight = startingheight;
    }

    public int getBanscore() {
        return banscore;
    }

    public void setBanscore(int banscore) {
        this.banscore = banscore;
    }

    public boolean isSyncnode() {
        return syncnode;
    }

    public void setSyncnode(boolean syncnode) {
        this.syncnode = syncnode;
    }
}
