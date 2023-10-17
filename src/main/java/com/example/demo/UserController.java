package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;

@RestController
public class UserController {

    private UserService us;
    @Autowired
    public UserController(UserService us) { this.us = us; }

    @GetMapping("/registerUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email) {

       return us.registerUser(name, email);

    @Autowired
    public UserController(AcknowledgeService AcknowledgeService){
        this.AcknowledgeService = AcknowledgeService;
        }
    }
    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody Details)
    {
        return AcknowledgeService.ackMessage(Details);
    }
}

