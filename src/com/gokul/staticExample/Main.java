package com.gokul.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22, "KUNAL", 2333,false);
//        Human gokzy = new Human(20, "Gokzyy", 2000, false);
//
//
//        System.out.println(kunal.name);
//        System.out.println(kunal.population);
//        System.out.println(gokzy.population);
        Main funn = new Main();
        funn.fun2();


    }

    // this is not depend on the object
    static void fun() {
        //greeting(); // you cant use this becoz it requires iinstance


        // u cant access the non static without referencing it in the static context
        // that why i here refrenecing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // We know that something which non static is belong to the object
    void greeting(){

        System.out.println("Welocme t the jungle");
    }
}
