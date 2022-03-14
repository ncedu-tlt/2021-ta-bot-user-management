package com.netcracker.edu.usermanagment.data.repositories;

import com.netcracker.edu.usermanagment.data.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByRole(String role);
}
