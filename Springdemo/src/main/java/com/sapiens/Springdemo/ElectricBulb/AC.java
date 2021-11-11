package com.sapiens.Springdemo.ElectricBulb;

public class AC implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("AC turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("AC is turned off");
    }

}
