package switchdemo;

/**
 * A switch works with the byte , short , char , and int primitive data types.
 * It also works with enumerated types (discussed in Enum Types), the String class,
 * and a few special classes that wrap certain primitive types: Character , Byte , Short , and Integer
 */
public class SwitchAllowedTypes {
    public static void main(String[] args){
        System.out.println(5/3);
        System.out.println(5%3);
        int x=5;
        long y =6; //long can't be put in a switch
        String s = "a";
        switch(s){
            case "a" : ;
            case "b" : ;
        }
    }
}
