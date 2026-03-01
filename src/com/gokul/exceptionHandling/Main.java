package com.gokul.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;

        try{
            divide(a,b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){

            throw new ArithmeticException();

        }
        return a/b;
    }
}
