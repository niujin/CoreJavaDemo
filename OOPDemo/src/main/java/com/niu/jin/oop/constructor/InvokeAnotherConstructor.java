package com.niu.jin.oop.constructor;

public class InvokeAnotherConstructor {
    public InvokeAnotherConstructor(){
        //invoking of another constructor should be the first statement.
        this("test");
        //Compile error, Can only call 1 constructor, not 2
        //this(5);
        System.out.println("default constructor");

    }

    public InvokeAnotherConstructor(String s){
        System.out.println(s);
    }

    public InvokeAnotherConstructor(int a){

    }
}
