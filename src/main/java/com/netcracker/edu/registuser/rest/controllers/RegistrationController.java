package com.netcracker.edu.registuser.rest.controllers;

import com.netcracker.edu.registuser.data.models.Role;
import com.netcracker.edu.registuser.data.models.UiRole.UiUser;
import com.netcracker.edu.registuser.data.models.User;
import com.netcracker.edu.registuser.services.implementations.RegistrationService;
import com.netcracker.edu.registuser.services.implementations.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private RoleService roleService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody UiUser uiUser) {
        Role role = roleService.findRoleByRoleId(uiUser.getRoleId());
        return ResponseEntity.ok(registrationService.createUser(uiUser, role));
    }


}
