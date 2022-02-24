package com.netcracker.edu.registuser.data.repositories;

import com.netcracker.edu.registuser.data.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Integer> {
}
