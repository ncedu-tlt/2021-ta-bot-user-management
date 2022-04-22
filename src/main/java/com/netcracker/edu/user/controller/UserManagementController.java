package com.netcracker.edu.user.controller;

import com.netcracker.edu.user.model.UiRole.UiUser;
import com.netcracker.edu.user.model.User;
import com.netcracker.edu.user.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserManagementController {

    @Autowired
    private UserManagementService userManagementService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody UiUser uiUser) {
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

}
