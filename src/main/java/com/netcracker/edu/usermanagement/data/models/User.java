package com.netcracker.edu.usermanagement.data.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "name")
    private String name;

    @Column(name = "registration")
    private Date registrationDate;

    @Column(name = "subscription")
    private boolean subscription;

    @Column(name = "city")
    private String city;

}

