package com.netcracker.edu.user.service;

import com.netcracker.edu.user.model.Role;
import com.netcracker.edu.user.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findRoleByRole(String name) {
        return roleRepository.findRoleByRole(name);
    }
}
