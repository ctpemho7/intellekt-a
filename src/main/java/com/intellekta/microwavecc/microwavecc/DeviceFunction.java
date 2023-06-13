package com.intellekta.microwavecc.microwavecc;

public abstract class DeviceFunction implements DeviceMode {
    @Override
    public void printHeatingMode() {
        System.out.println("The device is in heating mode");
    }

    void deviceOn() {
        System.out.println("Device is ON");
    }

    public abstract void deviceOff();
}
