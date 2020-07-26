package methodcall;

public class PassByValue {
    public static void foo(int a){
        a =6;
    }
    public static void main(String[] args){
        int b = 1;
        //When calling a method, a copy of b's value is passed to the method, so change value inside won't affect b.
        foo(b);
        System.out.println(b);

    }
}
