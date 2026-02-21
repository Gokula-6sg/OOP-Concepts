package com.gokul.introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45; // properties of the class

        Integer a = 12;
        Integer b = 33;

//        swap(a, b);

        System.out.println(a + " " + b);

        final A kunal = new A("kunal kushwaha");
        kunal.name = "other name";
//        kunal = new A("new obkject");

    }


//    static void swap(Integer a, Integer b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
}


    class A {
        final int a = 12;
        String name;

        A(String nam){
            System.out.println("object created");
            this.name = nam;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("object is destroyed");
        }
    }



