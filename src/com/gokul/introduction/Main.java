package com.gokul.introduction;

public class Main {
    public static void main(String[] args) {

        // Roll no of 3 student
        int[] roll = new int[3];

        // Nmaes of the 5 students
        String[] names = new String[5];

        // But the teachers nees all the names , roll no,, and marks inthe same 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


        //Instead of creating the above stuffs, we create all the stuff in single wrap is Class
        class student {
            int[] rno = new int[5];
            String[] name = new String[5];
            float[] marks = new float[5];
        }

    }
}