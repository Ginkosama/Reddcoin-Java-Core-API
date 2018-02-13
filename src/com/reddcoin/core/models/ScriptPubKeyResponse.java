package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class ScriptPubKeyResponse implements Serializable
{
    private String asm;
    private String hex;
    private String type;
    private int reqSigs;
    private ArrayList<String> addresses;

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRequestsigs() {
        return reqSigs;
    }

    public void setRequestsigs(int requestsigs) {
        this.reqSigs = requestsigs;
    }

    public ArrayList<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<String> addresses) {
        this.addresses = addresses;
    }
}
