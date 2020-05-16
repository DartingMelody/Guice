/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.config;

import com.google.inject.Singleton;

/**
 *
 * @author tarakhan
 */
@Singleton
public class AppConfigImpl implements AppConfig{

    @Override
    public String getConfiguration(String key) {
        //config can be stored in some db table, can use this method to access the configs
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
