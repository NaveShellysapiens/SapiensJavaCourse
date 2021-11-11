package com.sapiens.Springdemo.ElectricBulb;

public class ElectricPowerSwitch implements Switch{
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = true;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }
    }

    public static void main(String[] args) {

        Switchable switchableLight = new Light();
        Switch LightPowerSwitch = new ElectricPowerSwitch(switchableLight);
        LightPowerSwitch.press();
        LightPowerSwitch.press();

        Switchable switchableAC = new AC();
        Switch ACPowerSwitch = new ElectricPowerSwitch(switchableAC);
        ACPowerSwitch.press();
        ACPowerSwitch.press();

        Switchable switchableCooler = new Cooler();
        Switch CoolerPowerSwitch = new ElectricPowerSwitch(switchableCooler);
        CoolerPowerSwitch.press();
        CoolerPowerSwitch.press();

        Switchable switchableRefrigerator = new Refrigerator();
        Switch RefrigeratorPowerSwitch = new ElectricPowerSwitch(switchableRefrigerator);
        RefrigeratorPowerSwitch.press();
        RefrigeratorPowerSwitch.press();

        Switchable switchableTV = new TV();
        Switch TVPowerSwitch = new ElectricPowerSwitch(switchableTV);
        TVPowerSwitch.press();
        TVPowerSwitch.press();
    }
}
