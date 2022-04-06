package com.surendiran.EMS.service.impl;

import com.surendiran.EMS.entity.Employee;
import com.surendiran.EMS.repository.EmployeeRepository;
import com.surendiran.EMS.service.signature.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
