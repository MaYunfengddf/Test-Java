package com._Email;


public class Authen  extends Authenticator {
	String userName=null;   
    String password=null;   
        
    public Authen(){   
    }   
    public Authen(String username, String password) {    
        this.userName = username;    
        this.password = password;    
    }    
    protected PasswordAuthentication getPasswordAuthentication(){   
        return new PasswordAuthentication(userName, password);   
    }
}
