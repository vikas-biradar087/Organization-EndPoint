package com.org.dept.serviceImpl;

import com.org.dept.entity.Role;
import com.org.dept.exception.ResourceNotFoundException;
import com.org.dept.repository.RoleRepository;
import com.org.dept.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;


    public Role getRole(Long roleId) {
        return roleRepository.findById(roleId)
                .orElseThrow(() -> new ResourceNotFoundException("Role not found with id: " + roleId));
    }


    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }


    public Role createRole(Role role) {
        // Add any validation or business logic if needed
        return roleRepository.save(role);
    }


    public Role updateRole(Long roleId, Role newRole) {
        Role existingRole = getRole(roleId);
        // Update existingRole with fields from newRole
        // Add any validation or business logic if needed
        return roleRepository.save(existingRole);
    }


    public void deleteRole(Long roleId) {
        Role role = getRole(roleId);
        // Add any validation or business logic for deletion if needed
        roleRepository.delete(role);
    }
}
