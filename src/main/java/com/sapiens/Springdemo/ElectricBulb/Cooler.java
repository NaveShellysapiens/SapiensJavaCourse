package com.sapiens.Springdemo.ElectricBulb;

public class Cooler implements Switchable{
    public void turnOn() {
        System.out.println("Cooler turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Cooler is turned off");
    }
}
