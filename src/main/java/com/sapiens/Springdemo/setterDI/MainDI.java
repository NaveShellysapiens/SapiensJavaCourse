package com.sapiens.Springdemo.setterDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDI {
    public static void main(String[] args) {
        for(int i=1;i<5;i++)
        {
            String str="communication"+i;
            AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
            Communication communication = (Communication) context.getBean(str);
            communication.communication();
        }
    }
}
