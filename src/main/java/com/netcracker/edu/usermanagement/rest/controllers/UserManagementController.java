package com.netcracker.edu.usermanagement.rest.controllers;

import com.netcracker.edu.usermanagement.data.models.UiRole.UiUser;
import com.netcracker.edu.usermanagement.data.models.User;
import com.netcracker.edu.usermanagement.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@Valid @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.createUser(uiUser));
    }

    @PutMapping("/subscription/{id}")
    public ResponseEntity<User> updateSubscription(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.updateSubscription(id, uiUser));
    }

    @PutMapping("/city/{id}")
    public ResponseEntity<User> upDateCity(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(userManagementService.upDateCity(id, uiUser));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable("id") int id) {
        return ResponseEntity.ok(userManagementService.findUserById(id));
    }

    @GetMapping("/subscription")
    public ResponseEntity<List<User>> findUserBySubscription(){
        return ResponseEntity.ok(userManagementService.findUserBySubscription());
    }

}
