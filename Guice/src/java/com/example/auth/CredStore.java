/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.auth;

/**
 *
 * @author tarakhan
 */
public interface CredStore {
    
    public final String USER = "USER";
     public final String USER1 = "USER1";
    
    public Credentials getCredentials(String key);
}
