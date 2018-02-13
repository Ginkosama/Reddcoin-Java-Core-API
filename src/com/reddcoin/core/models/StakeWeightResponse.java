package com.reddcoin.core.models;

import java.io.Serializable;

public class StakeWeightResponse implements Serializable
{
    public int average;
    public int total;

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
