package com.reddcoin.core.models;

import java.io.Serializable;

public class TransactionOutputSetInfoResponse implements Serializable
{
    private int height;
    private String bestblock;
    private int transactions;
    private int txouts;
    private int bytes_serialized;
    private String hash_serialized;
    private float total_amount;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public int getNumberoftransactions() {
        return transactions;
    }

    public void setNumberoftransactions(int numberoftransactions) {
        this.transactions = numberoftransactions;
    }

    public int getNumberoftransactionoutputs() {
        return txouts;
    }

    public void setNumberoftransactionoutputs(int numberoftransactionoutputs) {
        this.txouts = numberoftransactionoutputs;
    }

    public int getBytesserialized() {
        return bytes_serialized;
    }

    public void setBytesserialized(int bytesserialized) {
        this.bytes_serialized = bytesserialized;
    }

    public String getHashserialized() {
        return hash_serialized;
    }

    public void setHashserialized(String hashserialized) {
        this.hash_serialized = hashserialized;
    }

    public float getTotalamount() {
        return total_amount;
    }

    public void setTotalamount(float totalamount) {
        this.total_amount = totalamount;
    }
}
