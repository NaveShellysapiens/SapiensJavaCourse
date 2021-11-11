package com.sapiens.Springdemo.JSRAnnotations;

public class OrderServiceImpl2 implements OrderService{
    @Override
    public String getOrderService(String orderId) {
        return "Order Details from Impl2 to order id: "+orderId;
    }
}
