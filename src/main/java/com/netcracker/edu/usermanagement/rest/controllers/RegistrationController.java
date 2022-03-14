package com.netcracker.edu.usermanagement.rest.controllers;

import com.netcracker.edu.usermanagement.data.models.Role;
import com.netcracker.edu.usermanagement.data.models.UiRole.UiUser;
import com.netcracker.edu.usermanagement.data.models.User;
import com.netcracker.edu.usermanagement.services.implementations.RegistrationService;
import com.netcracker.edu.usermanagement.services.implementations.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    private RoleService roleService;
    
    public RegistrationController(RoleService roleService){
        this.roleService = roleService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody UiUser uiUser) {
        Role role = roleService.findRoleByRole(uiUser.getRole());
        return ResponseEntity.ok(registrationService.createUser(uiUser, role));
    }

    @PutMapping("/{id}/subscription")
    public ResponseEntity<User> updateSubscription(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        if (uiUser.isSubscription() == false) {
            System.out.println("Вы подписались");
            return ResponseEntity.ok(registrationService.updateSubscription(id, uiUser));
        } else {
            System.out.println("Вы отписались");
            return ResponseEntity.ok(registrationService.updateSubscription(id, uiUser));
        }
    }



    @PutMapping("/{id}/city")
    public ResponseEntity<User> upDateCity(@PathVariable("id") int id, @RequestBody UiUser uiUser) {
        return ResponseEntity.ok(registrationService.upDateCity(id, uiUser));
    }


}
