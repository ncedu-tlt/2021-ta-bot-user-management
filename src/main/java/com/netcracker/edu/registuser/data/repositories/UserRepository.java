package com.netcracker.edu.registuser.data.repositories;

import com.netcracker.edu.registuser.data.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Integer> {
}
