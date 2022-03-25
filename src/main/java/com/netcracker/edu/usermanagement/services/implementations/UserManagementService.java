package com.netcracker.edu.usermanagement.services.implementations;

import com.netcracker.edu.usermanagement.data.models.Role;
import com.netcracker.edu.usermanagement.data.models.UiRole.UiUser;
import com.netcracker.edu.usermanagement.data.models.User;
import com.netcracker.edu.usermanagement.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
}
