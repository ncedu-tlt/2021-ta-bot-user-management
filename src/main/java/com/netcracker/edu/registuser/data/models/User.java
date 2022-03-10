package com.netcracker.edu.registuser.data.models;

import com.netcracker.edu.registuser.data.models.UiRole.UiUser;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "name")
    private String name;

    @Column(name = "registration")
    private Date registrationDate = new Date();

    @Column(name = "subscription")
    private boolean subscription;

    public User() {
    }

    public User(UiUser uiUser, Role role) {
        setName(uiUser.getName());
        setRole(role);
    }


}

