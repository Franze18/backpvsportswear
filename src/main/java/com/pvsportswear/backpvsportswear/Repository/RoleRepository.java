package com.pvsportswear.backpvsportswear.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvsportswear.backpvsportswear.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
 
    Optional<Role> findByName(String name);
} 