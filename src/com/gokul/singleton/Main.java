package com.gokul.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        //alll the 2 refernce variables are pointing ot the one object
    }
}
