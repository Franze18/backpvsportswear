package com.pvsportswear.backpvsportswear.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvsportswear.backpvsportswear.Model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

