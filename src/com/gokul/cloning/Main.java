package com.gokul.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human gokxy = new Human(23, "Gokzyy");

//        Human clone = new Human(gokxy);  Instead of doing this , now we can use the Object cloning

        Human twin = (Human)gokxy.clone();

        System.out.println(twin.age);
        System.out.println(gokxy.age);
    }
}
