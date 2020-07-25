package cast;

public class Base {

}

class Child extends Base{
    public static void main(String[] args){
        //Compile error, the real object must be in 'is-a' relation with the reference type.
        //Child c = new Base();


        Base b = new Child();


    }
}
