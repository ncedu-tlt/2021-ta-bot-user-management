package com.netcracker.edu.botlocation.services.implementations;
import com.netcracker.edu.botlocation.data.models.User;
import com.netcracker.edu.botlocation.data.repositories.UserReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserReposetory userReposetory;

    public User createUser(User newUser){
        return userReposetory.save(newUser);
    }

}
