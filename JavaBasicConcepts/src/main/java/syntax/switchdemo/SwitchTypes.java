package syntax.switchdemo;

public class SwitchTypes {
    public static void main(String[] args){
        System.out.println(5/3);
        System.out.println(5%3);
        int x=5;
        long y =6; //long can't be put in a switch
        String s = "a";
        switch(s){
            case "a" : ;
        }
    }
}
