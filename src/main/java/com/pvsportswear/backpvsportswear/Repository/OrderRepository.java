package com.pvsportswear.backpvsportswear.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvsportswear.backpvsportswear.Model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

