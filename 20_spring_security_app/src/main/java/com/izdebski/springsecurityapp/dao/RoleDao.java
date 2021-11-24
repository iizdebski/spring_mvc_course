package com.izdebski.springsecurityapp.dao;

import com.izdebski.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}