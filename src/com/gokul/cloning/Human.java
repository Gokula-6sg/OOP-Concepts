package com.gokul.cloning;

public class Human implements Cloneable {
    int age;
    String nam;

    public Human(int age, String nam) {
        this.age = age;
        this.nam = nam;
    }

    public Human(Human other){
        this.age = other.age;
        this.nam = other.nam;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
