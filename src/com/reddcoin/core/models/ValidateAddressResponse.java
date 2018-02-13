package com.reddcoin.core.models;

import java.io.Serializable;

public class ValidateAddressResponse implements Serializable
{
    private boolean isvalid;
    private String address;
    private boolean ismine;
    private boolean isscript;
    private String pubkey;
    private boolean iscompressed;
    private String account;

    public boolean isIsvalid() {
        return isvalid;
    }

    public void setIsvalid(boolean isvalid) {
        this.isvalid = isvalid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsmine() {
        return ismine;
    }

    public void setIsmine(boolean ismine) {
        this.ismine = ismine;
    }

    public boolean isIsscript() {
        return isscript;
    }

    public void setIsscript(boolean isscript) {
        this.isscript = isscript;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public boolean isIscompressed() {
        return iscompressed;
    }

    public void setIscompressed(boolean iscompressed) {
        this.iscompressed = iscompressed;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
