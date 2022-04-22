package com.netcracker.edu.user.repositories;

import com.netcracker.edu.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByName(String user);
    User findUserById(int id);
}



