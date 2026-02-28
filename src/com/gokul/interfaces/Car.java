package com.gokul.interfaces;

public class Car implements Brake, Engine,  Media{

    int a = 6;
    @Override
    public void brake() {
        System.out.println("I brake a car");

    }

    @Override
    public void start() {
        System.out.println("I start engine  a car");

    }

    @Override
    public void stop() {
        System.out.println("I stop eengine a car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate a car");

    }

    }
