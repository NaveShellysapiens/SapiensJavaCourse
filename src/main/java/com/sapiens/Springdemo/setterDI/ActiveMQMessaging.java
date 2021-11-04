package com.sapiens.Springdemo.setterDI;

public class ActiveMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending message Service ActiveMQMessaging");
    }
}
