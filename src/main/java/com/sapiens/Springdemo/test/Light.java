package com.sapiens.Springdemo.test;

public class Light implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned off");
    }
}
