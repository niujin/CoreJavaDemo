package functionalinterface;

public class FunctionalInterfaceDemo {


    public static int foo(int x){
        return 1;
    }

    public static void main(String[] args){
        //To create a instance of a funcational interface using method reference,
        //the method has to have same signature and return type.
        Square s = FunctionalInterfaceDemo::foo;

        //create a instance using lambda function
        Square s1 = x -> x+1;

        //Also it should have proper access to the method
        //Square s1 = MyClass::bar;can
    }

}

class MyClass{
    private static int bar(int x){
        return x;
    }
}


//
// A functional interface can have any number of default methods
// A functional interface is an interface that contains only one abstract method.
@FunctionalInterface
interface Square
{
    int calculate(int x);
}
