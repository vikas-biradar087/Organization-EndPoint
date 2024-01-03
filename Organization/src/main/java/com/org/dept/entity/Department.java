package com.org.dept.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "dept_description")
    private String deptDescription;

    // Getters and setters
}


