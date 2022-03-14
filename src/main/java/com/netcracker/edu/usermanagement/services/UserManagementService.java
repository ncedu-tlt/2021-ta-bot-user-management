package com.netcracker.edu.usermanagement.services;

import com.netcracker.edu.usermanagement.data.models.Role;
import com.netcracker.edu.usermanagement.data.models.UiRole.UiUser;
import com.netcracker.edu.usermanagement.data.models.User;
import com.netcracker.edu.usermanagement.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserManagementService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleService roleService;

    public User createUser(UiUser uiUser) {
        Role role = roleService.findRoleByRole(uiUser.getRole());
        User nameFind = userRepository.findUserById(uiUser.getId());

        if (nameFind != null) {
            return nameFind;
        } else {
            User user = new User();
            user.setId(uiUser.getId());
            user.setSubscription(uiUser.isSubscription());
            user.setName(uiUser.getName());
            user.setRole(role);
            user.setCity(uiUser.getCity());
            user.setRegistrationDate(new Date());
            return userRepository.save(user);
        }
    }

    public User updateSubscription(int id, UiUser uiUser) {

        User user = userRepository.findUserById(id);
        user.setSubscription(uiUser.isSubscription());
        return userRepository.save(user);
    }

    public User upDateCity(int id, UiUser uiUser) {
        User user = userRepository.findUserById(id);
        user.setCity(uiUser.getCity());
        return userRepository.save(user);
    }

    public User findUserById(int id) {
        return userRepository.findUserById(id);
    }

    public List<User> findUserBySubscription(){
        return userRepository.findUserBySubscription();
    }
}
