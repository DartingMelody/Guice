/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;

import com.google.inject.AbstractModule;

/**
 *
 * @author tarakhan
 */
public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        //the developer can bind as many interface to classes here
        bind(APIClient.class).to(APIClientImpl.class);
    }
    
}
