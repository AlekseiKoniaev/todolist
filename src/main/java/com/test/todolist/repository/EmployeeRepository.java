package com.test.todolist.repository;

import com.test.todolist.dto.mapper.EmployeeMapper;
import com.test.todolist.dto.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmployeeRepository {

    private final EmployeeMapper employeeMapper;
    private final JdbcTemplate jdbcTemplate;

    public Employee findById(Integer id) {

        try {
            String sql = "SELECT * FROM employee WHERE id=?";
            return jdbcTemplate.queryForObject(sql, employeeMapper, id);
        } catch (DataAccessException e) {
            return null;
        }
    }
}
