package com.reddcoin.core.models;

import java.io.Serializable;

public class MiningInfoResponse implements Serializable
{
    private int blocks;
    private int currentblocksize;
    private int currentblocktx;
    private float difficulty;
    private String errors;
    private int genproclimit;
    private int networkhashps;
    private int pooledtx;
    private boolean testnet;
    private boolean generate;
    private int hashespersec;
    private StakeWeightResponse stakeweight;
    private int stakeinterest;
    private long netstakeweight;

    public int getNumberofblocks() {
        return blocks;
    }

    public void setNumberofblocks(int numberofblocks) {
        this.blocks = numberofblocks;
    }

    public int getCurrentblocksize() {
        return currentblocksize;
    }

    public void setCurrentblocksize(int currentblocksize) {
        this.currentblocksize = currentblocksize;
    }

    public int getCurrentblocktransaction() {
        return currentblocktx;
    }

    public void setCurrentblocktransaction(int currentblocktransaction) {
        this.currentblocktx = currentblocktransaction;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }

    public int getGenproclimit() {
        return genproclimit;
    }

    public void setGenproclimit(int genproclimit) {
        this.genproclimit = genproclimit;
    }

    public int getNetworkhashps() {
        return networkhashps;
    }

    public void setNetworkhashps(int networkhashps) {
        this.networkhashps = networkhashps;
    }

    public int getPooledtransaction() {
        return pooledtx;
    }

    public void setPooledtransaction(int pooledtransaction) {
        this.pooledtx = pooledtransaction;
    }

    public boolean isTestnet() {
        return testnet;
    }

    public void setTestnet(boolean testnet) {
        this.testnet = testnet;
    }

    public boolean isGenerate() {
        return generate;
    }

    public void setGenerate(boolean generate) {
        this.generate = generate;
    }

    public int getHashespersec() {
        return hashespersec;
    }

    public void setHashespersec(int hashespersec) {
        this.hashespersec = hashespersec;
    }

    public StakeWeightResponse getStakeweight() {
        return stakeweight;
    }

    public void setStakeweight(StakeWeightResponse stakeweight) {
        this.stakeweight = stakeweight;
    }

    public int getStakeinterest() {
        return stakeinterest;
    }

    public void setStakeinterest(int stakeinterest) {
        this.stakeinterest = stakeinterest;
    }

    public long getNetstakeweight() {
        return netstakeweight;
    }

    public void setNetstakeweight(long netstakeweight) {
        this.netstakeweight = netstakeweight;
    }
}
