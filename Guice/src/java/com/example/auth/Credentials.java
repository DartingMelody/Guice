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
public class Credentials {
    
    String name;
    String secret;   
    
    public Credentials(String name, String secret)
    {
        this.name = name;
        this.secret = secret;
    }
    
    public String getName()
    {
        return name;
    }
    public String getSecret()
    {
        return secret;
    }
}
