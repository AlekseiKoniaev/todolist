package com.test.todolist.dto.mapper;

import com.test.todolist.dto.model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

        return Employee.builder()
                .id(rs.getInt("id"))
                .creationDate(rs.getTimestamp("creation_date").toLocalDateTime())
                .title(rs.getString("title"))
                .role(rs.getString("role"))
                .build();
    }
}
