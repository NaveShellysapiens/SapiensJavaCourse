package com.sapiens.Springdemo.setterDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {
    public static void main(String[] args) {
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            Communication communication = (Communication) context.getBean("communication");
            communication.communication();
    }
}
