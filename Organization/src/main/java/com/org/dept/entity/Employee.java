package com.org.dept.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Email
    @Column(name = "email")
    private String email;

    @Pattern(regexp = "\\d{10}")
    @Column(name = "mobile_number")
    private String mobileNumber;

    @Min(18)
    @Column(name = "age")
    private int age;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "sub_org_id")
    private SubOrganization subOrganization;

    @ManyToOne
    @JoinColumn(name = "dept_id") // This is the foreign key column in the employee table
    private Department department;

    // Getters and setters
}
