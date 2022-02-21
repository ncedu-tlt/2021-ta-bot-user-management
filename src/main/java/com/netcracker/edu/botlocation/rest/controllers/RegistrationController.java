package com.netcracker.edu.botlocation.rest.controllers;

import com.netcracker.edu.botlocation.data.models.User;
import com.netcracker.edu.botlocation.services.implementations.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private RegistrationService RegistrationService;

    public RegistrationController(RegistrationService registrationService){
        this.RegistrationService = RegistrationService;
    }

    @PostMapping("/User/Regist")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(RegistrationService.createUser(user));
    }
}
