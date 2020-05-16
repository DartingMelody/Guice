/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.auth;

import com.google.inject.Singleton;

/**
 *
 * @author tarakhan
 */
@Singleton
public class CredStoreImpl implements CredStore{

    @Override
    public Credentials getCredentials(String key) {
        
        //implementation used in production, implement according to the cred store is used in the system
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
