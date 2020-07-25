package methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Constructor reference uses type inference to find the correct version of constructor.
 */
public class ConstructorReferenceDemo {
    public ConstructorReferenceDemo(Object o){

    }

    public ConstructorReferenceDemo(Integer i){

    }

    public ConstructorReferenceDemo(String s){

    }

    public ConstructorReferenceDemo(Integer i, String s){

    }

    public static void main(String[] args){
        //Will find the constructor with parameter type Object
        Function f = ConstructorReferenceDemo::new;

        //the constructor with parameter type String
        Function<String,ConstructorReferenceDemo> f1 = ConstructorReferenceDemo::new;

        //The constructor with parameter type Integer
        Function<Integer,ConstructorReferenceDemo> f2 = ConstructorReferenceDemo::new;

        //constructor with parameter type Integer and String
        BiFunction<Integer,String,ConstructorReferenceDemo> bf = ConstructorReferenceDemo::new;
    }
}
