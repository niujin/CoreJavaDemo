package com.jin.niu;

import java.util.HashMap;
import java.util.Map;

class Tree { } 
class Pine extends Tree { } 
class Oak extends Tree { } 
public class Test5 
{ 
    public static void main (String [] args)
    { 
       Map<String, String> m = new HashMap<String, String>();
       String a = "a";
       String b = "a";
       //String c = "c";
       m.put(a, "1");
    } 
}
