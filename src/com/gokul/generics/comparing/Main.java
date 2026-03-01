package com.gokul.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(23, 45.4f);
        Student gokzy = new Student(25, 46.4f);


        //while comparing the both object.., by which u will comapre???
        if(kunal.compareTo(gokzy) <0){
            System.out.println("gokzy has more marks");
        }


    }
}
