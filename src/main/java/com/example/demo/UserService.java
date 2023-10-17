package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// UserService with annotation
@Service //or Componet, @Service, or @Respository depending on purpose of class
public class UserService {
    private final EmailService emailservice;

    @Autowired // Constructor injection
    public UserService(EmailService emailservice) {
        this.emailservice = emailservice; //Loose Coupling

    }

    public String registerUser(String username, String email) {
        //Some  user registration logic

        //Send Confirmation email
       String message = emailservice.sendEmail(email, "Welcome to our Platform" + username +"\t" + email);
    }
}

