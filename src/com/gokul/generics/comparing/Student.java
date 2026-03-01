package com.gokul.generics.comparing;

public class Student implements Comparable <Student> {
    int rno;
    float marks;

    public Student(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
         int diff = (int) (this.marks - o.marks);

         // the condition here given is if diff ==0; both are equal marks
        // if diff<0 means o is bigger; else o is smaller

         return diff;
    }
}
