package cast;

public class Base {
    int a =5;
}

class Child extends Base{
    int a =10;
    public static void main(String[] args){
        Base b = new Child();
        System.out.println(b.a);
    }
}
