package com.niu.jin;

public class Erasure<T> {

    //Can't create a static field of type parameter
    //static T t2;
    T t1;

    public void f1(){
        //Type parameter can't be insantiatied directly
        //T t = new T();

        // Type parameter can't be used by instanceof
        //System.out.println(t1 instanceof T);

        String s = "";
        System.out.println(t1 instanceof String);

    }

    public static void main(String[] args){
        //Can't create a array of a typed class
        //Erasure<Integer>[] eArray = new Erasure<Integer>[10];

        //however you can define a reference
        Erasure<Integer>[] eArray;

        new Erasure<Integer>().f1();
    }
}
