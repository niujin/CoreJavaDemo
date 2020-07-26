package syntax.types.numbers;

/**
 * @Author Jin Niu
 * 1. If you perform any mathematical or bitwise operations on primitive data types that are smaller than <b>int</b>,
 * they will be promoted to int first and result will be <b>int</b> too
 * 2. float and double is wider than long, even though float size is only 4 bytes. So convert long to float will need
 * explicit cast.
 */
public class TypeConversion {
    public static void main(String[] args) {
        // exponential format by default is double type, so needs to be explicit cast
        float expflo = (float)1.5e-10;

        short a = 257;
        /*compile error because a is a short type and it's promoted to int type and when assign back to b, it should
        explicitly cast to short.
        */
        //short b = a + 5;
        //short b = a >> 2;
    }
}
