package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class ReceivedByAddressResponse implements Serializable
{
    private String address;
    private String account;
    private double amount;
    private int confirmations;
    private ArrayList<String> txids;

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumberofconfirmations() {
        return confirmations;
    }

    public void setNumberofconfirmations(int numberofconfirmations) {
        this.confirmations = numberofconfirmations;
    }

    public ArrayList<String> getTransactionidentifiers() {
        return txids;
    }

    public void setTransactionidentifiers(ArrayList<String> transactionidentifiers) {
        this.txids = transactionidentifiers;
    }
}
