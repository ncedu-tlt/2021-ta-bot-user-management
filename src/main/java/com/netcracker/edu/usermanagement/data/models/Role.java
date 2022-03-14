package com.netcracker.edu.usermanagement.data.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    private int id;

    @Column(name = "name")
    private String role;

}
