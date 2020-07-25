package com.niu.jin;

import java.util.Arrays;
import java.util.List;

class Fruit{

}

class Apple extends Fruit{

}

class Smith extends Apple{

}
class John<POWER extends Apple> extends Smith{

}
public class WildCardDemo {

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());
    static List<Smith> smith = Arrays.asList(new Smith());

    //Exact type parameter can be cast to wildcard
    static List<? extends Apple> appleList= apples;
    static List<? extends Apple> smithList= smith;
    static List<? super Apple> castList2= apples;
    static List<? super Apple> castList1= fruit;


    static <T extends Apple> void foo(List<? extends T> list){

    }

    static class CovariantReader<T> {
        T readCovariant(List<? extends T> list) {
            return list.get(0);
        }
    }
    static void f3() {
        CovariantReader<Fruit> fruitReader =
                new CovariantReader<Fruit>();
        //Be careful when dealing with generics. First thing to figure out
        //is it's dealing with the parameter or the class itself. In below method,
        //the parameter passed in is List<Fruit>, so it can be downcast to List<? extends Fruit>
        Fruit f = fruitReader.readCovariant(fruit);
        Fruit a = fruitReader.readCovariant(apples);
    }
    public static void main(String[] args) {
        f3();
    }
}
