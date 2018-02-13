package com.reddcoin.core.models;

import java.io.Serializable;

public class InfoResponse implements Serializable
{
    private int version;
    private int protocolversion;
    private int walletversion;
    private float balance;
    private float stake;
    private boolean locked;
    private boolean encrypted;
    private int blocks;
    private int timeoffset;
    private float moneysupply;
    private int connections;
    private String proxy;
    private float difficulty;
    private boolean testnet;
    private int keypoololdest;
    private int keypoolsize;
    private int unlocked_until;
    private float paytxfee;
    private float relayfee;
    private String errors;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getProtocolversion() {
        return protocolversion;
    }

    public void setProtocolversion(int protocolversion) {
        this.protocolversion = protocolversion;
    }

    public int getWalletversion() {
        return walletversion;
    }

    public void setWalletversion(int walletversion) {
        this.walletversion = walletversion;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getStake() {
        return stake;
    }

    public void setStake(float stake) {
        this.stake = stake;
    }

    public boolean isIslocked() {
        return locked;
    }

    public void setIslocked(boolean islocked) {
        this.locked = islocked;
    }

    public boolean isIsencrypted() {
        return encrypted;
    }

    public void setIsencrypted(boolean isencrypted) {
        this.encrypted = isencrypted;
    }

    public int getNumberofblocks() {
        return blocks;
    }

    public void setNumberofblocks(int numberofblocks) {
        this.blocks = numberofblocks;
    }

    public int getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    public float getMoneysupply() {
        return moneysupply;
    }

    public void setMoneysupply(float moneysupply) {
        this.moneysupply = moneysupply;
    }

    public int getNumberofconnections() {
        return connections;
    }

    public void setNumberofconnections(int numberofconnections) {
        this.connections = numberofconnections;
    }

    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isTestnet() {
        return testnet;
    }

    public void setTestnet(boolean testnet) {
        this.testnet = testnet;
    }

    public int getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoololdest(int keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public int getUnlockeduntil() {
        return unlocked_until;
    }

    public void setUnlockeduntil(int unlockeduntil) {
        this.unlocked_until = unlockeduntil;
    }

    public float getPaytransactionfee() {
        return paytxfee;
    }

    public void setPaytransactionfee(float paytransactionfee) {
        this.paytxfee = paytransactionfee;
    }

    public float getRelayfee() {
        return relayfee;
    }

    public void setRelayfee(float relayfee) {
        this.relayfee = relayfee;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
