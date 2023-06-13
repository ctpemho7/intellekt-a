package com.intellekta.microwavecc.microwavecc;

public class ManualMicrowave extends DeviceFunction{
    @Override
    public void deviceOff() {
        System.out.println("Waiting for new task");
    }
}
