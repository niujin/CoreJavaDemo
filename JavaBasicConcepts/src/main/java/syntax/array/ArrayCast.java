package syntax.array;

import java.util.stream.Stream;

public class ArrayCast {
    public static void main(String[] args){
        //When create array using literal, the array type is treated as array of the reference type,
        // even though the element type can be different.

        //Type is Object[]
        Object[] array1 = {Integer.valueOf(1)};

        //Type is Super[]
        Super[] sArray = {new Sub()};

        //When array is created using new, the Type will be the actual Type used will new.
        Object[] array2 = new Integer[10];

        System.out.println(array1.getClass().getName());
        System.out.println(sArray.getClass().getName());
        System.out.println(array2.getClass().getName());

        //Ojbect[] can't be cast to Integer[]
        //Integer[] intArray = (Integer[]) array1;

        //This works because the actual type of array2 is Integer[]
        Integer[] intArray = (Integer[]) array2;
        array1 = array2;


        Super[] superArray = new Super[10];
        Sub[] subArray2 = new Sub[10];

        //Array of superclass can't be cast to array of subclass
        //Sub[] subArray = (Sub[]) superArray;

        //But Array of subclass can be cast to array of superclass
        superArray = subArray2;

        //element of superclass array can be cast to its subtype
        Sub sub1 = (Sub)superArray[0];
    }
}

class Super{

}

class Sub extends Super{

}
