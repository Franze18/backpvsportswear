package com.pvsportswear.backpvsportswear.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvsportswear.backpvsportswear.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
