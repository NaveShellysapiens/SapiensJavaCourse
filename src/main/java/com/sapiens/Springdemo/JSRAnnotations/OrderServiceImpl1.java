package com.sapiens.Springdemo.JSRAnnotations;

public class OrderServiceImpl1 implements OrderService{
    @Override
    public String getOrderService(String orderId) {
        return "Order Details from Impl1 to order id: "+orderId;
    }
}
