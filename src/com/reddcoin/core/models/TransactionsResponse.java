package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class TransactionsResponse implements Serializable
{
    private String account;
    private String address;
    private String category;
    private float amount;
    private int confirmations;
    private String blockhash;
    private int blockindex;
    private int blocktime;
    private String txid;
    private ArrayList<Object> walletconflicts;
    private int time;
    private int timereceived;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public int getBlockindex() {
        return blockindex;
    }

    public void setBlockindex(int blockindex) {
        this.blockindex = blockindex;
    }

    public int getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }

    public String getTransactionid() {
        return txid;
    }

    public void setTransactionid(String transactionid) {
        this.txid = transactionid;
    }

    public ArrayList<Object> getWalletconflicts() {
        return walletconflicts;
    }

    public void setWalletconflicts(ArrayList<Object> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(int timereceived) {
        this.timereceived = timereceived;
    }
}
