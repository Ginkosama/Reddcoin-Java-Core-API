package com.reddcoin.core.models;

import java.io.Serializable;

public class TransactionOutputResponse implements Serializable
{
    private String bestblock;
    private int confirmations;
    private float value;
    private ScriptPubKeyResponse scriptpubkey;
    private int version;
    private boolean coinbase;

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getNumberofconfirmations() {
        return confirmations;
    }

    public void setNumberofconfirmations(int numberofconfirmations) {
        this.confirmations = numberofconfirmations;
    }

    public float getTransactionvalue() {
        return value;
    }

    public void setTransactionvalue(float transactionvalue) {
        this.value = transactionvalue;
    }

    public ScriptPubKeyResponse getScriptpubkey() {
        return scriptpubkey;
    }

    public void setScriptpubkey(ScriptPubKeyResponse scriptpubkey) {
        this.scriptpubkey = scriptpubkey;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isCoinbase() {
        return coinbase;
    }

    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }
}
