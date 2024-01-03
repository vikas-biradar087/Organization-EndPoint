package com.org.dept.service;

import com.org.dept.entity.Organization;

import java.util.List;

public interface OrganizationService {

    // create organization
    Organization createOrg(Organization organization);

    // get All organization
    List<Organization> getAllOrganization();

    // Update Organization
    Organization updateOrganization(long id,Organization organization);

    // Delete Organization
    void deleteOrganization(long id);
}
