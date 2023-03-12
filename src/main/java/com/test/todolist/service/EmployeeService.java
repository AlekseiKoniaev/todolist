package com.test.todolist.service;

import com.test.todolist.dto.model.Employee;
import com.test.todolist.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee getById(Integer id) {
        return employeeRepository.findById(id);
    }


}
