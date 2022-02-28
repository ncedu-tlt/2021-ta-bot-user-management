package com.netcracker.edu.registuser.rest.controllers;

import com.netcracker.edu.registuser.data.models.User;
import com.netcracker.edu.registuser.services.implementations.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/Register")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(registrationService.createUser(user));
    }

    @GetMapping
    public ResponseEntity <Iterable<User>> getAllUsers(){
        return ResponseEntity.ok(registrationService.getUsers());
    }
}
