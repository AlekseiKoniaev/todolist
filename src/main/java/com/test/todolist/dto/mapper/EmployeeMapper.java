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
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setCreationDate(rs.getTimestamp("creation_date").toLocalDateTime());
        employee.setTitle(rs.getString("title"));
        employee.setRole(rs.getString("role"));
        return employee;
    }
}
