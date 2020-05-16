/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.config;

import com.google.inject.AbstractModule;
/**
 *
 * @author tarakhan
 */
public class ConfigLocalModule extends AbstractModule {
    
     @Override
    protected void configure() {       
        bind(AppConfig.class).to(PropertiesFileAppConfigImpl.class);
    }
}