package com.netcracker.edu.registuser.services.implementations;

import com.netcracker.edu.registuser.data.models.Role;
import com.netcracker.edu.registuser.data.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role findRoleByRoleId(String name) {
        return roleRepository.findRoleByRoleId(name);
    }
}
