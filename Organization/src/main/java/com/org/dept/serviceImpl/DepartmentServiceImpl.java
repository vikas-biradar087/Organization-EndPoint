package com.org.dept.serviceImpl;

import com.org.dept.entity.Department;
import com.org.dept.exception.ResourceNotFoundException;
import com.org.dept.repository.DepartmentRepository;
import com.org.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartment(Long deptId) {
        return departmentRepository.findById(deptId)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + deptId));
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department createDepartment(Department department) {
        // Add any validation or business logic if needed
        return departmentRepository.save(department);
    }

    public void deleteDepartment(Long deptId) {
        Department department = getDepartment(deptId);
        // Add any validation or business logic for deletion if needed
        departmentRepository.delete(department);
    }
}
