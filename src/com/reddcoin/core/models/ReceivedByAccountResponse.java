package com.reddcoin.core.models;

import java.io.Serializable;

public class ReceivedByAccountResponse implements Serializable
{
    private String account;
    private double amount;
    private int confirmations;

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
}
