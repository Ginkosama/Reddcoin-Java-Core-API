package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class NetworkInfoResponse implements Serializable
{
    private int version;
    private int protocolversion;
    private int timeoffset;
    private int connections;
    private String proxy;
    private float relayfee;
    private ArrayList<LocalAddressResponse> localaddresses;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getProtocolversion() {
        return protocolversion;
    }

    public void setProtocolversion(int protocolversion) {
        this.protocolversion = protocolversion;
    }

    public int getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    public int getConnections() {
        return connections;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public float getRelayfee() {
        return relayfee;
    }

    public void setRelayfee(float relayfee) {
        this.relayfee = relayfee;
    }

    public ArrayList<LocalAddressResponse> getLocaladdresses() {
        return localaddresses;
    }

    public void setLocaladdresses(ArrayList<LocalAddressResponse> localaddresses) {
        this.localaddresses = localaddresses;
    }
}
