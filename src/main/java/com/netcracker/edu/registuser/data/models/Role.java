package com.netcracker.edu.registuser.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    private int id;

    @Column(name = "name")
    private String roleId;

    public Role(int id, String role) {
        setId(id);
        setRoleId(role);
    }

    public Role() {

    }

}
