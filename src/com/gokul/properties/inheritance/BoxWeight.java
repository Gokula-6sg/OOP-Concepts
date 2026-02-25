package com.gokul.properties.inheritance;

public class BoxWeight extends Box {

    double weight;


    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight (BoxWeight other){
        super(other);
        this.weight = other.weight;

    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);  // What is this?? --- this is call the parent class constructor
        // used to initialised the parent class constructor
        this.weight = weight;
    }
}
