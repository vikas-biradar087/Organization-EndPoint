package com.org.dept.controller;

import com.org.dept.entity.Department;
import com.org.dept.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{deptId}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long deptId) {
        Department department = departmentService.getDepartment(deptId);
        return ResponseEntity.ok(department);
    }

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department createdDepartment = departmentService.createDepartment(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDepartment);
    }

    @DeleteMapping("/{deptId}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long deptId) {
        departmentService.deleteDepartment(deptId);
        return ResponseEntity.noContent().build();
    }
}

