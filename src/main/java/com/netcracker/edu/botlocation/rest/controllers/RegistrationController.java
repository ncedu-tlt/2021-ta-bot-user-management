package com.netcracker.edu.botlocation.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private RegistrationController registrationController;

    @Autowired
    public RegistrationController(RegistrationController registrationController){
        this.registrationController = registrationController;
    }

    @GetMapping("/User/Regist")
    public String regist(){

    }
}
