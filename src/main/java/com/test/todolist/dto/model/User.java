package com.test.todolist.dto.model;

import lombok.*;

@Data
public class User {
    private long ID;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public User(){

    }

    public User(long id, String firstName, String lastName, String userName, String password){

        this.ID = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

}
