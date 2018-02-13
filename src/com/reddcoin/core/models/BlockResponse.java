package com.reddcoin.core.models;

import java.io.Serializable;
import java.util.ArrayList;

public class BlockResponse implements Serializable
{
    private String hash ;
    private int confirmations ;
    private int size ;
    private int height ;
    private int version ;
    private String merkleroot ;
    private ArrayList<String> tx ;
    private int time ;
    private int nonce ;
    private String bits ;
    private float difficulty ;
    private String chainwork ;
    private String previousblockhash ;
    private String nextblockhash ;
    private String flags ;
    private float moneysupply ;
    private float mint ;
    private int entropybit ;
    private String modifier ;
    private String modifierchecksum ;
    private String signature;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getNumberofconfirmations() {
        return confirmations;
    }

    public void setNumberofconfirmations(int numberofconfirmations) {
        this.confirmations = numberofconfirmations;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public ArrayList<String> getTransactions() {
        return tx;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.tx = transactions;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getBits() {
        return bits;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public float getMoneysupply() {
        return moneysupply;
    }

    public void setMoneysupply(float moneysupply) {
        this.moneysupply = moneysupply;
    }

    public float getMint() {
        return mint;
    }

    public void setMint(float mint) {
        this.mint = mint;
    }

    public int getEntropybit() {
        return entropybit;
    }

    public void setEntropybit(int entropybit) {
        this.entropybit = entropybit;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifierchecksum() {
        return modifierchecksum;
    }

    public void setModifierchecksum(String modifierchecksum) {
        this.modifierchecksum = modifierchecksum;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
