package com.org.dept.service;

import com.org.dept.entity.Role;

import java.util.List;

public interface RoleService {


    Role getRole(Long roleId);

    List<Role> getAllRoles();

    Role createRole(Role role);

    Role updateRole(Long roleId, Role newRole);

    void deleteRole(Long roleId);

}
