package com.tutorials.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginService(){
        System.out.println("Don't use reflection");
        try {
            throw new Exception("Constructor error");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean authenticateUser(String usr, String pass){
        if(usr.equals("Kamlesh")||  usr.equals("Kamlesh Kumar") && pass.equals("Dun Dun Dun") || pass.equals("dun dun dun"))
            return true;
        return false;


    }

}
