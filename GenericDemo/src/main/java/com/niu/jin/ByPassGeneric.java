package com.niu.jin;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jin
 *
 */
public class ByPassGeneric {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("test");
        //Compile time check failed
        //l.add(12);
        //here you can cast a typed list to an untyped list so that
        // the restrictions of generics will be passed.
        List unTypedList = l;

        //now integer can be added to list
        unTypedList.add(1);
    }
}
