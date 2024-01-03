package com.org.dept.controller;


import com.org.dept.entity.SubOrganization;
import com.org.dept.service.SubOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subOrg")
public class SubOrganizationController {

    @Autowired
    private SubOrganizationService subOrganizationService;

    @GetMapping("/{subOrgId}")
    public ResponseEntity<SubOrganization> getSubOrganization(@PathVariable Long subOrgId) {
        SubOrganization subOrganization = subOrganizationService.getSubOrganization(subOrgId);
        return ResponseEntity.ok(subOrganization);
    }

    @GetMapping
    public ResponseEntity<List<SubOrganization>> getAllSubOrganizations() {
        List<SubOrganization> subOrganizations = subOrganizationService.getAllSubOrganizations();
        return ResponseEntity.ok(subOrganizations);
    }

    @PostMapping
    public ResponseEntity<SubOrganization> createSubOrganization(@RequestBody SubOrganization subOrganization) {
        SubOrganization createdSubOrganization = subOrganizationService.createSubOrganization(subOrganization);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSubOrganization);
    }

    // Update and delete methods can be added if needed
}

