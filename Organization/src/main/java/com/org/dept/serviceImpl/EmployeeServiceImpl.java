package com.org.dept.serviceImpl;

import com.org.dept.entity.Employee;
import com.org.dept.exception.ResourceNotFoundException;
import com.org.dept.repository.EmployeeRepository;
import com.org.dept.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        public Employee getEmployee(Long employeeId) {
            return employeeRepository.findById(employeeId)
                    .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        }

        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        public Employee createEmployee(Employee employee) {
            // Add any validation or business logic if needed
            return employeeRepository.save(employee);
        }

        public Employee updateEmployee(Long employeeId, Employee newEmployee) {
            Employee existingEmployee = getEmployee(employeeId);
            // Update existingEmployee with fields from newEmployee
            // Add any validation or business logic if needed
            return employeeRepository.save(existingEmployee);
        }

        public void deleteEmployee(Long employeeId) {
            Employee employee = getEmployee(employeeId);
            // Add any validation or business logic for deletion if needed
            employeeRepository.delete(employee);
        }
    }


