package com.org.dept.service;

import com.org.dept.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getEmployee(Long employeeId);

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long employeeId, Employee employee);

    void deleteEmployee(Long employeeId);
}
