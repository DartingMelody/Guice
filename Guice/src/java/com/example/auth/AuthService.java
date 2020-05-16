/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.auth;

import com.example.config.AppConfig;

/**
 *
 * @author tarakhan
 */
public class AuthService {
    
    CredStore creds;
    AppConfig config;
    
    public AuthService(CredStore creds, AppConfig config)                              
    {
        this.creds = creds;
        this.config = config;     
    }

    public String getAPIResult() {
        //use creds and config to make http calls if build is local different config and cred classes will be picked up
        //if config is not local different config and cred classes will be picked up
        return "Success";
    } 
    
}
