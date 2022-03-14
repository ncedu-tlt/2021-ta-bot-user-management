package com.netcracker.edu.usermanagement.data.models.UiRole;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UiUser {

    private int id;
    private String role;
    private String name;
    private boolean subscription;
    @NotNull
    private String city;

}
