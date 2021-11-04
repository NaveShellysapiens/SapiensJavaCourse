package com.sapiens.Springdemo.JSRAnnotations;

public class OrderServiceImpl5 implements OrderService {
    @Override
    public String getOrderService(String orderId) {
        return "Order Details from Impl5 to order id: "+orderId;
    }
}
