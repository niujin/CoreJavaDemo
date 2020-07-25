package q21;

interface C{
    A a = new A();
}

class A{
    A(){
        System.out.println("This is A");
    }
}

public class InterfaceField implements C{
    public static void main(String[] args){
        //No output. Before a class is initialized, its direct superclass must be initialized,
        //but interfaces implemented by the class need not be initialized
        InterfaceField i = new InterfaceField();

        //Since field is accessed, so the interface is initialized
        System.out.println(C.a);
    }

}
