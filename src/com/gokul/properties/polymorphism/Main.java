package com.gokul.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Shapes sqaure = new Square();

        sqaure.area();
    }
}
