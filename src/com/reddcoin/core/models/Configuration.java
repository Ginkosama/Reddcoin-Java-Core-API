package com.reddcoin.core.models;

import java.io.Serializable;

public class Configuration implements Serializable
{
    private String url;
    private String username;
    private String password;
    private String passphrase;
    private int timeout;

    public Configuration(String url, String username, String password, String passphrase, int timeout) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.passphrase = passphrase;
        this.timeout = timeout;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
