package com.housingcentre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.housingcentre.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

	Role findByName(String name);

}
