/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.auth;

import com.google.inject.AbstractModule;

/**
 *
 * @author tarakhan
 */
public class AuthModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(CredStore.class).to(CredStoreImpl.class);
    }
    
}