package com.niu.jin.oop.constructor;
class Parent{

}

class Sub1 extends  SuperUsage{

    public Sub1(){
        //If super() is removed, it will cause compile error since SuperUsage class
        // defines explicit constructor, so compiler won't provide
        //the default constructor.
        super(5);
        System.out.println("Sub1 Constructor!");
    }
}
public class SuperUsage extends Parent{
    int a;
    public SuperUsage(int a){
        //super() is optional here since base class only has the default constructor, so the compiler knows
        //which one to call.
        //super();
        this.a =a;
        //compilation error: super() must be the first statement to use.
        //super();
    }

    public static void main(String[] args){
        SuperUsage s = new SuperUsage(5);
        s = new Sub1();
    }

}
