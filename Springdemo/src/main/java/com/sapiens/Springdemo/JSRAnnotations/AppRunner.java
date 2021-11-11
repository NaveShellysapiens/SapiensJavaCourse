package com.sapiens.Springdemo.JSRAnnotations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;


public class AppRunner {
    @Bean(name = "OrderServiceA")
    public OrderService orderServiceByProvider1(){
        return new OrderServiceImpl1();
    }

    @Bean(name = "OrderServiceB")
    public OrderService orderServiceByProvider2(){
        return new OrderServiceImpl2();
    }
    @Bean(name = "OrderServiceC")
    public OrderService orderServiceByProvider3(){
        return new OrderServiceImpl3();
    }
    @Bean(name = "OrderServiceD")
    public OrderService orderServiceByProvider4(){
        return new OrderServiceImpl4();
    }
    @Bean(name = "OrderServiceE")
    public OrderService orderServiceByProvider5(){
        return new OrderServiceImpl5();
    }

    @Bean
    public OrderServiceClient createClient(){
        return new OrderServiceClient();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }
}
