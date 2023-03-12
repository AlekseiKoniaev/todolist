package com.test.todolist.dto.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

    private Integer id;
    private LocalDateTime creationDate;
    private String title;
    private String role;

}
