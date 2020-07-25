package inheritance;

class Super {
    public int field = 0;
    public int getField() { return field; }
}
class Sub extends Super {
    public int field = 1;
    public int getField() { return field; }
    public int getSuperField() { return super.field; }
}

public class FieldBehavior {
    public static void main(String[] args) {
        Super sup = new Sub(); // Upcast

        //Direct field access is determined at compile time, so if the reference is a Super type
        //it will get the field defined in Super even though the actual object is a Sub.
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }
}
