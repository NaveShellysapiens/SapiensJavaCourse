package com.sapiens.Springdemo.JSRAnnotations;

public class OrderServiceImpl4 implements OrderService {
    @Override
    public String getOrderService(String orderId) {
        return "Order Details from Impl4 to order id: "+orderId;
    }
}
