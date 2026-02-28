package com.gokul.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine Start");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine Stop");

    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine AAccelreate");

    }
}
