package com.pvsportswear.backpvsportswear.NotFoundException;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super("Could not found product with " + id);
    }
}
