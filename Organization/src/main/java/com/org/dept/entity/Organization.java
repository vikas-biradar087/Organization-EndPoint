package com.org.dept.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "OrgName",length = 10,nullable = false,unique = true)
    private String orgName;
    @Column(name = "HealthCare",length = 10,nullable = false,unique = true)
    private String healthcare;

    @Column(name = "Telecom",length = 10,nullable = false,unique = true)
    private String telecom;


    @OneToMany(mappedBy = "organization",cascade = CascadeType.ALL)
    private List<SubOrganization> subOrganizations;

}
