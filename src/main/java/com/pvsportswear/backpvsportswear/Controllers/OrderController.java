package com.pvsportswear.backpvsportswear.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pvsportswear.backpvsportswear.Model.Order;
import com.pvsportswear.backpvsportswear.NotFoundException.OrderNotFoundException;
import com.pvsportswear.backpvsportswear.Repository.OrderRepository;

@RestController
public class OrderController {

    OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return repo.findAll();
    }

    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new OrderNotFoundException(id));
    }

    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder) {
        repo.save(newOrder);
        return "A new order has been added";
    }

    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable Long id) {
        repo.deleteById(id);
        return "An order has been deleted!";
    }
}

