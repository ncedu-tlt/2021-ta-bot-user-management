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
        return userRepository.save(new User(uiUser, role));
    }

    public User updateSubscription(int id, UiUser uiUser){
        User user = userRepository.getById(id);
        user.setSubscription(uiUser.isSubscription());
        return userRepository.save(user);
    }

    public User upDateCity(int id, UiUser uiUser) {
        User user = userRepository.getById(id);
        user.setCity(uiUser.getCity());
        return userRepository.save(user);
    }
}
