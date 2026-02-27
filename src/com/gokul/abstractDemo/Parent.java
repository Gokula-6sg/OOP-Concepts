package com.gokul.abstractDemo;

public abstract class Parent {

    int num;
    final int numn;

    public Parent(int num){
        this.num = num;
        numn = 23;

    }

    static void number(){
        System.out.println("Hllo nunber");
    }

    void normal(){
        System.out.println(" normal method");
    }

    abstract void career();
    abstract void partner();
}
