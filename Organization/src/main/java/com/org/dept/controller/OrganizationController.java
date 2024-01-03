package com.org.dept.controller;

import com.org.dept.entity.Organization;
import com.org.dept.payload.ApiResponse;
import com.org.dept.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgApi")
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<Organization> createOrg(@RequestBody Organization organization){
        Organization org = organizationService.createOrg(organization);
        return new ResponseEntity<>(org, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Organization>> fetchAll(){
//        organizationService.getAllOrganization();
        return ResponseEntity.ok(organizationService.getAllOrganization());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Organization> updateOrg(@PathVariable("id") long id,@RequestBody Organization organization){
        Organization updateOrg = organizationService.updateOrganization(id, organization);
        return ResponseEntity.ok(updateOrg);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteRecord(@PathVariable("id") long id){
        organizationService.deleteOrganization(id);
        return new ResponseEntity(new ApiResponse("Organization deleted successfully",true),HttpStatus.OK);
    }


}
