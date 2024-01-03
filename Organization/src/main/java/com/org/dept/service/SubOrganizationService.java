package com.org.dept.service;

import com.org.dept.entity.SubOrganization;

import java.util.List;

public interface SubOrganizationService {




        SubOrganization getSubOrganization(Long subOrgId);

        List<SubOrganization> getAllSubOrganizations();

        SubOrganization createSubOrganization(SubOrganization subOrganization);

        // Incomplete method signatures for update and delete if needed
    }


