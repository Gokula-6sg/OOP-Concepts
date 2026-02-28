package com.gokul.interfaces.ExtendedDemo;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Main implements A,B {

    @Override
    public void hello() {
        System.out.println("hello vanakm");

    }

    @Override
    public void vanakam() {

    }

    public static void main(String[] args) {
        Main main = new Main();

        main.hello();
        B.pooja();  // we only access the static method with the created interface like A.method


    }
}
