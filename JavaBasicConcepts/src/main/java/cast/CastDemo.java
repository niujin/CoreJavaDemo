package cast;

public class CastDemo {
    public static void main(String[] args){

        Object o = new Object();
        //Fail at runtime, the type of the object has to be exactly the same as reference.
        //Integer i = (Integer) o;

        Object o1 = Integer.valueOf(1);
        Integer i1 = (Integer) o1;
    }
}
