/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.example.auth.AuthService;
import com.example.auth.CredStore;
import com.example.config.AppConfig;
import com.google.inject.Inject;
import java.util.List;

/**
 *
 * @author tarakhan
 */
public class APIClientImpl implements APIClient{
    
    AppConfig config = null;   
    CredStore creds = null;
    
    @Inject
    public APIClientImpl(CredStore creds, AppConfig config)
    {
        System.out.println("Constructor called with credstore "+ creds + " and config "+ config);
        this.config = config;
        this.creds = creds;
    }

    @Override
    public String getResult() {
        String url = config.getConfiguration("ROOTPATH");
        System.out.println("url is "+url);
        AuthService authService = new AuthService(creds, config);
        String result = authService.getAPIResult();
        return result;
    }
    
}
