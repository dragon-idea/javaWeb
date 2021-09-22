package com.longdi.service;

import com.longdi.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
