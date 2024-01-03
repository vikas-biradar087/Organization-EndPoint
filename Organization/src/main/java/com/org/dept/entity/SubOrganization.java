package com.org.dept.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name = "subOrganization")
public class SubOrganization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String OrganizationName;
    private String Description;
    private String AboutOrganization;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;
}
