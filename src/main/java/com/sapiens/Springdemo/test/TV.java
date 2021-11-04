package com.sapiens.Springdemo.test;

public class TV implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Tv turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");
    }

}
