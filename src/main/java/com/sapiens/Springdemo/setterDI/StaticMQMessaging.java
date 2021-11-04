package com.sapiens.Springdemo.setterDI;

public class StaticMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending message Service StaticMQMessaging");
    }
}
