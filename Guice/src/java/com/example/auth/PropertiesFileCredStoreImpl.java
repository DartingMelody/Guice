/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.auth;

import com.google.inject.Singleton;
import java.util.Properties;

/**
 *
 * @author tarakhan
 */
@Singleton
public class PropertiesFileCredStoreImpl implements CredStore {

    Properties localCredProps = new Properties();
    

    public PropertiesFileCredStoreImpl()
    {
        initialize();
    }
    
    private void initialize() {
        try {
            System.out.println("Loading credentials.properties file ");
            localCredProps.load(this.getClass().getResourceAsStream("/credentials.properties"));
            System.out.println("Successfully loaded credentials.properties file");            
        } catch (Exception e) {
            System.out.println("Exception during reading credentials.properties file "+ e);       
        } finally {
            System.out.println("Check if reaching here");
        }
        
    }
   
    
    @Override
    public Credentials getCredentials(String key) {
        // for each key there are 2 rows in the propertie file e.g
        // USER.name
        // USER.secret
        // we fetch both and return a credential
        System.out.println("Fetching credentials for key {}"+ key);
        
        String name = localCredProps.getProperty(key + ".name");
        String secret = localCredProps.getProperty(key + ".secret");
        System.out.println("name is "+name);
        System.out.println("secret is "+secret);
        if (name == null) {
            System.out.println("Did not find "+key+".name in the properties file ");
            throw new RuntimeException(String.format("No %s.name property in the credentials.propertiles file", key));
        }
        if (secret == null) {
            System.out.println("Did not find " + key + ".secret in the properties file ");
            throw new RuntimeException(String.format("No %s.secret property in the credentials.propertiles file",key));
        }
        return new Credentials(name, secret);
    }
    
}