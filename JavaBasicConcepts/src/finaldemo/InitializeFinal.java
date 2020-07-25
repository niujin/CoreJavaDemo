package finaldemo;

public class InitializeFinal {
    //For non-static variable, it either can be initialized when it's defined,
    // in a non-static code block or in the constructor. But can be done only once,
    // If try to initialize in more than one place it will have compilation error.
    public final A a = new A();
    public final A a1;
    public final A a2;
    {
        a2 = new A();
    }

    //For static final variable, it can be initialized either at definition or in static block
    public static final A a3 = new A();
    public static final A a4;
    static{
        a4 = new A();
    }
    public InitializeFinal(){
        a1 = new A();
    }

}

class A{

        }
