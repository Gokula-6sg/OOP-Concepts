package com.gokul.abstractDemo;

public class Son extends Parent {

    public Son(int num){
        super(num);
        System.out.println(numn);

    }


    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {

        System.out.println("I wants to be a police");
    }

    @Override
    void partner() {
        System.out.println(" i love poooja");

    }
}
