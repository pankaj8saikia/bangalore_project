package com.pankmri.korim.rest.dto;

import java.io.Serializable;

/**
 * @Project user-activity
 * @Author mgohain
 * @Created 2019-11-16
 **/
public class LoginDTO implements Serializable {
    private String username;
    private String password;

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
}
