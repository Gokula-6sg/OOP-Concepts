package com.gokul.abstractDemo;

public class Main {

    public static void main(String[] args) {

        Parent son = new Son(89);

        Daughter daughter = new Daughter(99);

        daughter.career();

        son.partner();
        son.normal();






    }
}
