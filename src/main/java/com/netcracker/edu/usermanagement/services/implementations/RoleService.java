package com.netcracker.edu.usermanagement.services.implementations;

import com.netcracker.edu.usermanagement.data.models.Role;
import com.netcracker.edu.usermanagement.data.repositories.RoleRepository;
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
