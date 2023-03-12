package com.test.todolist.dto.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

    private Integer id;
    private LocalDateTime creationDate;
    private String role;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    //ToDO Enum роли
    // Переписать маппер
    // Интерфейс репозитория сделать
}
