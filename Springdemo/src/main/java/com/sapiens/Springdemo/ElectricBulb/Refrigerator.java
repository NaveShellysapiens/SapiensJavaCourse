package com.sapiens.Springdemo.ElectricBulb;

public class Refrigerator implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator is turned off");
    }
}
