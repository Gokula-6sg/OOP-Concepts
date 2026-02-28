package com.gokul.interfaces.Nested;

public class AA {

    //Nested interface

    protected interface NestedInterface{  //top level interface - it should be declared as protected, public
        boolean isOdd(int num);
    }


}

class B implements AA.NestedInterface{


    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
