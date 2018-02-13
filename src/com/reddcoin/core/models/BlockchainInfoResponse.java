package com.reddcoin.core.models;

import java.io.Serializable;

public class BlockchainInfoResponse implements Serializable
{
    private String chain;
    private int blocks;
    private String bestblockhash;
    private float difficulty;
    private float verificationprogress;
    private String chainWork;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public float getVerificationprogress() {
        return verificationprogress;
    }

    public void setVerificationprogress(float verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public String getChainWork() {
        return chainWork;
    }

    public void setChainWork(String chainWork) {
        this.chainWork = chainWork;
    }
}
