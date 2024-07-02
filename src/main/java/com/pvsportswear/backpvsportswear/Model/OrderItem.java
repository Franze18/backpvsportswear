package com.pvsportswear.backpvsportswear.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long orderItemId;
    private Long orderId;
    private Long productId;
    private int quantity;
    private double price;
    
    OrderItem(){}

    public OrderItem(Long orderId, double price, Long productId, int quantity) {
        this.orderId = orderId;
        this.price = price;
        this.productId = productId;
        this.quantity = quantity;
    }

    //getters
    public Long getOrderItemId() {
        return orderItemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    //setters

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
