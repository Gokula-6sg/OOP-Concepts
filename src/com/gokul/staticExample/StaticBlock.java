package com.gokul.staticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {

    static int a = 4;
    static int b;


    // will only run once, when the obj is create that is when the class is load for the first time
    static{
        System.out.println("im in static block");
        b = a * 5;
    }

    public static void main(String[] args) {

        StaticBlock obj = new StaticBlock();
        System.out.println(obj.a + " " + obj.b);

        obj.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(obj2.a + " " + obj2.b);
    }

}
