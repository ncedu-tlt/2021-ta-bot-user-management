package com.netcracker.edu.registuser.data.repositories;

import com.netcracker.edu.registuser.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByName(String user);
}



