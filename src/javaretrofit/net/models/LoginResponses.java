/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaretrofit.net.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Ezequiel
 */
public class LoginResponses {

    @SerializedName("status")
    @Expose
    private boolean status;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("level_access")
    @Expose
    private boolean levelAccess;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isLevelAccess() {
        return levelAccess;
    }

    public void setLevelAccess(boolean levelAccess) {
        this.levelAccess = levelAccess;
    }

    @Override
    public String toString() {
        return "LoginResponses{" + "status=" + status + ", msg=" + msg + ", token=" + token + ", data=" + data + ", levelAccess=" + levelAccess + '}';
    }
    
    

}
