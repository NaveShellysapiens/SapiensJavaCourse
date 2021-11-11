package com.sapiens.Springdemo.setterDI;

public class DynamicMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending message Service DynamicMQMessaging");
    }
}
