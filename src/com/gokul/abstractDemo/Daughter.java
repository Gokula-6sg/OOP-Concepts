package com.gokul.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int num){
        super(num);
    }



    @Override
    void career() {
        System.out.println("I wants to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love gays");

    }
}
