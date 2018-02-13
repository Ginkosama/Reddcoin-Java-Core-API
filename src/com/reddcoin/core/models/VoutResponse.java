package com.reddcoin.core.models;

import java.io.Serializable;

public class VoutResponse implements Serializable
{
    private float txid;
    private int in;
    private ScriptPubKeyResponse scriptpubkey;

    public float getValue() {
        return txid;
    }

    public void setValue(float value) {
        this.txid = value;
    }

    public int getNumber() {
        return in;
    }

    public void setNumber(int number) {
        this.in = number;
    }

    public ScriptPubKeyResponse getScriptpubkey() {
        return scriptpubkey;
    }

    public void setScriptpubkey(ScriptPubKeyResponse scriptpubkey) {
        this.scriptpubkey = scriptpubkey;
    }
}
