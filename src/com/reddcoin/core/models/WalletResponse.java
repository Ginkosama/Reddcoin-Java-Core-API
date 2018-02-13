package com.reddcoin.core.models;

import java.io.Serializable;

public class WalletResponse implements Serializable
{
    private String walletversion;
    private float balance;
    private long txcount;
    private float keypoololdest;
    private long unlocked_until;
    private long keypoolsize;

    public String getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(String walletversion) {
        this.walletversion = walletversion;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public long getTxcount() {
        return txcount;
    }

    public void setTxcount(long txcount) {
        this.txcount = txcount;
    }

    public float getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(float keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public long getUnlockeduntil() {
        return unlocked_until;
    }

    public void setUnlockeduntil(long unlockeduntil) {
        this.unlocked_until = unlockeduntil;
    }

    public long getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(long keypoolsize) {
        this.keypoolsize = keypoolsize;
    }
}
