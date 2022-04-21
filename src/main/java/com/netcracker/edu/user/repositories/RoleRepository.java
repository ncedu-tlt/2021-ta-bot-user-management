package com.netcracker.edu.user.repositories;

import com.netcracker.edu.user.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleByRole(String role);
}
