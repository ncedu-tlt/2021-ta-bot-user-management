package com.netcracker.edu.usermanagment.data.repositories;

import com.netcracker.edu.usermanagment.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByName(String user);
}



