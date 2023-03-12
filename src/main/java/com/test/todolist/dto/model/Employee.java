package com.test.todolist.dto.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Employee {

    private Integer id;
    private LocalDateTime creationDate;
    private String title;
    private String role;

}
