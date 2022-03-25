package com.netcracker.edu.usermanagement.data.repositories;

import com.netcracker.edu.usermanagement.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByName(String user);
}



