package com.pvsportswear.backpvsportswear.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "ordertbl")
public class Order {

    @Id
    @GeneratedValue 
    private Long orderid;
    private Long userId;
    private double totalAmmount;
    private String status;

    Order(){}

    public Order(String status, double totalAmmount, Long userId) {
        this.status = status;
        this.totalAmmount = totalAmmount;
        this.userId = userId;
    }


    //getters
    public Long getOrderid() {
        return orderid;
    }

    public Long getUserId() {
        return userId;
    }

    public double getTotalAmmount() {
        return totalAmmount;
    }

    public String getStatus() {
        return status;
    }

    //setters

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setTotalAmmount(double totalAmmount) {
        this.totalAmmount = totalAmmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
