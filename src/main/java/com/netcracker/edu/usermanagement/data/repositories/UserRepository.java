package com.netcracker.edu.usermanagement.data.repositories;

import com.netcracker.edu.usermanagement.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(int id);

    @Query(value = "select *\n" +
            "from users\n" +
            "where users.subscription = true",nativeQuery = true)
    List<User> findUserBySubscription();
}



