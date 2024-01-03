package com.org.dept.service;

import com.org.dept.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department getDepartment(Long deptId);

    List<Department> getAllDepartments();

    Department createDepartment(Department department);

    void deleteDepartment(Long deptId);
}
