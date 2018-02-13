package com.reddcoin.core.models;

import java.io.Serializable;

public class UnspentResponse implements Serializable
{
    private String txid;
    private int vout;
    private String address;
    private String account;
    private String scriptpubkey;
    private float amount;
    private int confirmations;

    public String getTransactionid() {
        return txid;
    }

    public void setTransactionid(String transactionid) {
        this.txid = transactionid;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getScriptpubkey() {
        return scriptpubkey;
    }

    public void setScriptpubkey(String scriptpubkey) {
        this.scriptpubkey = scriptpubkey;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getNumberofconfirmations() {
        return confirmations;
    }

    public void setNumberofconfirmations(int numberofconfirmations) {
        this.confirmations = numberofconfirmations;
    }
}
