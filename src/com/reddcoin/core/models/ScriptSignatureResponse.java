package com.reddcoin.core.models;

import java.io.Serializable;

public class ScriptSignatureResponse implements Serializable
{
    private String asm;
    private String hex;

    public String getAsm() {
        return asm;
    }

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}
