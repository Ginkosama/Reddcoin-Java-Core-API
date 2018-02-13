package com.reddcoin.core.models;

import java.io.Serializable;

public class LocalAddressResponse implements Serializable
{
    private String address;
    private int Port;
    private int score;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
