package com.reddcoin.core.models;

import com.squareup.moshi.Json;

import java.io.Serializable;

public class StakingInfoResponse implements Serializable
{
    private boolean enabled;
    private boolean staking;
    private int currentblocksize;
    private int currentblocktx;
    private int pooledtx;
    private float difficulty;
    @Json(name = "search-interval") private int search_interval;
    private int averageweight;
    private int totalweight;
    private long netstakeweight;
    private long expectedtime;

    public boolean isIsenabled() {
        return enabled;
    }

    public void setIsenabled(boolean isenabled) {
        this.enabled = isenabled;
    }

    public boolean isIsstaking() {
        return staking;
    }

    public void setIsstaking(boolean isstaking) {
        this.staking = isstaking;
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

    public int getPooledtransaction() {
        return pooledtx;
    }

    public void setPooledtransaction(int pooledtransaction) {
        this.pooledtx = pooledtransaction;
    }

    public float getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(float difficulty) {
        this.difficulty = difficulty;
    }

    public int getSearchinterval() {
        return search_interval;
    }

    public void setSearchinterval(int searchinterval) {
        this.search_interval = searchinterval;
    }

    public int getAverageweight() {
        return averageweight;
    }

    public void setAverageweight(int averageweight) {
        this.averageweight = averageweight;
    }

    public int getTotalweight() {
        return totalweight;
    }

    public void setTotalweight(int totalweight) {
        this.totalweight = totalweight;
    }

    public long getNetstakeweight() {
        return netstakeweight;
    }

    public void setNetstakeweight(long netstakeweight) {
        this.netstakeweight = netstakeweight;
    }

    public long getExpectedtimeinseconds() {
        return expectedtime;
    }

    public void setExpectedtimeinseconds(long expectedtimeinseconds) {
        this.expectedtime = expectedtimeinseconds;
    }
}
