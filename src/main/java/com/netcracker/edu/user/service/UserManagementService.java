package com.netcracker.edu.user.service;

import com.netcracker.edu.user.model.Role;
import com.netcracker.edu.user.model.UiRole.UiUser;
import com.netcracker.edu.user.model.User;
import com.netcracker.edu.user.repositories.UserRepository;
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
        User nameFind = userRepository.findUserByName(uiUser.getName());

        if (nameFind != null) {
            System.out.println("Пользователь есть в базе данных");
            return nameFind;
        } else {
            User user = new User();
            user.setSubscription(uiUser.isSubscription());
            user.setName(uiUser.getName());
            user.setRole(role);
            user.setCity(uiUser.getCity());
            user.setRegistrationDate(new Date());
            return userRepository.save(user);
        }
    }

    public User updateSubscription(int id, UiUser uiUser) {

        User user = userRepository.getById(id);
        user.setSubscription(uiUser.isSubscription());
        if (!user.isSubscription()) {
            System.out.println("Вы подписались");
        } else {
            System.out.println("Вы отписались");
        }
        return userRepository.save(user);
    }

    public User upDateCity(int id, UiUser uiUser) {
        User user = userRepository.getById(id);
        user.setCity(uiUser.getCity());
        return userRepository.save(user);
    }

    public User findUserById(int id) {

        return userRepository.findUserById(id);}

}
