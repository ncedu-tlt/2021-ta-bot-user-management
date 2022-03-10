package com.netcracker.edu.registuser.services.implementations;

import com.netcracker.edu.registuser.data.models.Role;
import com.netcracker.edu.registuser.data.models.UiRole.UiUser;
import com.netcracker.edu.registuser.data.models.User;
import com.netcracker.edu.registuser.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UiUser uiUser, Role role) {
        return userRepository.saveAndFlush(new User(uiUser, role));
    }

}
