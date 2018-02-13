package com.reddcoin.core.models;

import java.io.Serializable;

public class VinResponse implements Serializable
{
    private String txid;
    private int vout;
    private ScriptSignatureResponse scriptSig;
    private Object sequence;

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

    public ScriptSignatureResponse getScriptsignature() {
        return scriptSig;
    }

    public void setScriptsignature(ScriptSignatureResponse scriptsignature) {
        this.scriptSig = scriptsignature;
    }

    public Object getSequence() {
        return sequence;
    }

    public void setSequence(Object sequence) {
        this.sequence = sequence;
    }
}
