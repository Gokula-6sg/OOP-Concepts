package com.gokul.access;

public class A {
    private int num;
    String nam;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String nam) {
        this.num = num;
        this.nam = nam;
        this.arr = new int[num];
    }
}
