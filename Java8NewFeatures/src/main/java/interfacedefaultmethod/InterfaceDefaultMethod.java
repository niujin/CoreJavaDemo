package interfacedefaultmethod;

interface MyInterface {

    //Method implementation with default keyword
    default void foo(){
        System.out.println("foo");
    }

    //interfaces are not allowed to have Object class default methods, because for any class they will be overridden.
    /*
    default boolean equals(Object o){
        return true;
    }
    */

    //Method implementation with static keyword
    static void bar(){
        System.out.println("bar");
    }

}

interface AnotherInterface {
    default void foo(){
        System.out.println("foo");
    }
}

public class InterfaceDefaultMethod implements MyInterface{
    public void main(String[] args){
        InterfaceDefaultMethod idm = new InterfaceDefaultMethod();

        //call the default method
        idm.foo();

        //call the static method
        MyInterface.bar();

    }
}

//If a class implements multiple interfaces and they have same default methods, the class should override it.
class A implements MyInterface, AnotherInterface{
    @Override
    public void foo() {

    }
}
