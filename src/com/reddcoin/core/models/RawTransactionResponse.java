package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class RawTransactionResponse implements Serializable
{
    private String hex;
    private String txid;
    private int version;
    private int locktime;
    private ArrayList<VinResponse> vin;
    private ArrayList<VoutResponse> vout;
    private String blockhash;
    private int confirmations;
    private int time;
    private int blocktime;

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getTransactionid() {
        return txid;
    }

    public void setTransactionid(String transactionid) {
        this.txid = transactionid;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getLocktime() {
        return locktime;
    }

    public void setLocktime(int locktime) {
        this.locktime = locktime;
    }

    public ArrayList<VinResponse> getVin() {
        return vin;
    }

    public void setVin(ArrayList<VinResponse> vin) {
        this.vin = vin;
    }

    public ArrayList<VoutResponse> getVout() {
        return vout;
    }

    public void setVout(ArrayList<VoutResponse> vout) {
        this.vout = vout;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public int getNumberofconfirmations() {
        return confirmations;
    }

    public void setNumberofconfirmations(int numberofconfirmations) {
        this.confirmations = numberofconfirmations;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }
}
