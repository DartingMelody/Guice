/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.config;

import com.google.inject.Singleton;
import java.util.Properties;

/**
 *
 * @author tarakhan
 */
@Singleton
public class PropertiesFileAppConfigImpl implements AppConfig{

   Properties localConfigProps = new Properties();
    
    public PropertiesFileAppConfigImpl()
    {
        initialize();
    }
    
    private void initialize() {
        try {
            System.out.println("Loading appconfig.properties file ");
            localConfigProps.load(this.getClass().getResourceAsStream("/appconfig.properties"));
            System.out.println("Successfully loaded appconfig.properties file");            
        } catch (Exception e) {
            System.out.println("Exception during reading appconfig.properties file "+ e);       
        }
    }
   
    
    @Override
    public String getConfiguration(String key) {
     
        System.out.println("Fetching configuration for key "+ key);
        String config = localConfigProps.getProperty(key);
        System.out.println("Configuration value for key "+ key+ " is " + config);
        return config;
    }
    
}
