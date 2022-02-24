package com.netcracker.edu.registuser.services.implementations;
import com.netcracker.edu.registuser.data.models.User;
import com.netcracker.edu.registuser.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User newUser){
        return userRepository.save(newUser);
    }

}
