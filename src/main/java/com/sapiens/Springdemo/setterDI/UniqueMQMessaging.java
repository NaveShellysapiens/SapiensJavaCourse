package com.sapiens.Springdemo.setterDI;

public class UniqueMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending message Service UniqueMQMessaging");
    }
}
