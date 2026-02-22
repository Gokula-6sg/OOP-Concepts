package com.gokul.staticExample;

public class InnerClasses {

    // we should use static, when the class is inside the another class, becoz the Test class is depend on the Innerclass 's obj

    static class Test{
        int age;

        public Test(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {

        Test obj = new Test(12);
        Test obj2 = new Test(33);

    }
}
