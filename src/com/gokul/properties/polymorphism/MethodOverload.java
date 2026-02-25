package com.gokul.properties.polymorphism;

public class MethodOverload {


    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum( int a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();

        obj.sum(2,3);
        //obj.sum(2,2,2,2); This thing will give the error bcoz this cant intisliaxed


        // the all the methods as the same name "sum" but they has diff args, so it is called METHOD OVERLOADING


    }
}
