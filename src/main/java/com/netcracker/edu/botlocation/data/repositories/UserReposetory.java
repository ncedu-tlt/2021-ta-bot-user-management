package com.netcracker.edu.botlocation.data.repositories;

import com.netcracker.edu.botlocation.data.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReposetory extends CrudRepository <User, Integer> {

    User findByFirst_nameAndLast_name(String firstName, String lastName);
}