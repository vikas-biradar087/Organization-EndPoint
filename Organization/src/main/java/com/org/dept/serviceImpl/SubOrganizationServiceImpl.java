package com.org.dept.serviceImpl;

import com.org.dept.entity.SubOrganization;
import com.org.dept.exception.ResourceNotFoundException;
import com.org.dept.repository.SubOrganizationRepository;
import com.org.dept.service.SubOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubOrganizationServiceImpl implements SubOrganizationService {



        @Autowired
        private SubOrganizationRepository subOrganizationRepository;

        public SubOrganization getSubOrganization(Long subOrgId) {
            return subOrganizationRepository.findById(subOrgId)
                    .orElseThrow(() -> new ResourceNotFoundException("SubOrganization not found with id: " + subOrgId));
        }

        public List<SubOrganization> getAllSubOrganizations() {
            return subOrganizationRepository.findAll();
        }

        public SubOrganization createSubOrganization(SubOrganization subOrganization) {
            // Add any validation or business logic if needed
            return subOrganizationRepository.save(subOrganization);
        }

    }



