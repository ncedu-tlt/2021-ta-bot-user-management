package com.netcracker.edu.usermanagement.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    private int id;

    @Column(name = "name")
    private String role;

}
