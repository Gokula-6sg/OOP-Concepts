package com.gokul.introduction;

public class Main {
    public static void main(String[] args) {

//        // Roll no of 3 student
//        int[] roll = new int[3];
//
//        // Nmaes of the 5 students
//        String[] names = new String[5];
//
//        // But the teachers nees all the names , roll no,, and marks inthe same 5 students
//        int[] rno = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];


        //Instead of creating the above stuffs, we create all the stuff in single wrap is Class

        // datatype for the every single student
        class student {
            int rno;
            String name ;
            float marks ;

            // We need to add the values for the above properties   object by object

            //We need one word to access all the objects



            //this is when the : Student raandom = new Student(kunal);
            //when u call the another objeect in the constructer , it will be shown

            student(student other){
                this.rno = other.rno;
                this.name = other.name;
                this.marks = other.marks;
            }

            //this is when the student kunal = new student();
            // when the there is no parameter is given

            student(){

               // this is how u call constructer form the another constructer

                this(13, "Default", 34.5f);

            }


            // Student arprit = new student (13, :ragitr", 23.4)
            // here this will replace with arprit

            student(int rno, String name, float marks){
                this.rno = rno;
                this.name = name;
                this.marks = marks;
            }
        }

        student kunal = new student(12,"Gokzy" , 33.4f);
        System.out.println(kunal.rno);
        student gokzy = new student();

        student random = new student(kunal);



    }
}