package com.netcracker.edu.usermanagement.rest.controllers;

import com.netcracker.edu.usermanagement.data.models.UiRole.UiUser;
import com.netcracker.edu.usermanagement.data.models.User;
import com.netcracker.edu.usermanagement.services.implementations.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;


    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.createUser(uiUser));
    }

    @PutMapping("/{id}/subscription")
    public ResponseEntity<User> updateSubscription(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.updateSubscription(id, uiUser));
    }

    @PutMapping("/{id}/city")
    public ResponseEntity<User> upDateCity(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.upDateCity(id, uiUser));
    }


}
