package com.org.dept.serviceImpl;

import com.org.dept.entity.Organization;
import com.org.dept.exception.ResourceNotFoundException;
import com.org.dept.repository.OrganizationRepository;
import com.org.dept.service.OrganizationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    private OrganizationRepository organizationRepository;
    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization createOrg(Organization organization) {

        return organizationRepository.save(organization);
    }

    @Override
    public List<Organization> getAllOrganization() {

        return organizationRepository.findAll();

    }

    @Override
    public Organization updateOrganization(long id, Organization organization) {
        Organization updateOrganization  = organizationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Given Organization Id Not Found !!" + id));

        updateOrganization.setOrgName(organization.getOrgName());
        updateOrganization.setHealthcare(organization.getHealthcare());
        updateOrganization.setTelecom(organization.getTelecom());
        return organizationRepository.save(updateOrganization);

    }

    @Override
    public void deleteOrganization(long id) {
        Organization deleteorganization = organizationRepository.findById(id).orElseThrow(

                () -> new ResourceNotFoundException("Organization Id Not Found" + id)
        );

        this.organizationRepository.delete(deleteorganization);
    }
}



