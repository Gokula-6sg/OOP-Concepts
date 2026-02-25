package com.gokul.properties.inheritance;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(2,3,4);
//        Box box1 = new Box(box);
//
//        System.out.println(box1.h +" "+box1.l+" "+box1.w);


       // Box box6 = new BoxWeight(2,3,4,5);

//        u can't access the weight , because the parent class is referencing the child class
        // Only the type of reference var can be determine , what are the members can be accessed
//        System.out.println(box6.weight);



        //there are many variable in the both parent and child classes
        //you are given access to the variables which are in the type ref i.e BoxWeight
        // hence, you should have the access to weight variable
        // this also means, that ones you are trying to access should be initialised
        // but here, when the obj itself is of type of parent class, then how will you call the constructor for child class
        // thats why it is error

        // parent class has no idea about the variables presented in the child class, but thge type of ref is child class

        // we use obj type for inistialisation, but Box can't access the weight , so u can't inisialise the weight

//        BoxWeight box5 = new Box(2,23,23);


        BoxPrice box = new BoxPrice();



        
    }
}

