package com.niu.jin.oop.constructor;

public class Test {
    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    public static final <T> void foo(){

    }
    private Test() {
    }
}
