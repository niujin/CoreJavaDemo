package foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String []args ){
        //First way to create array
        int [] numbers = {1,2,3,4,5};

        //Second way to create array
        int [] anothernums = new int[5];
        anothernums[0] =1;
        anothernums[1] =2;

        //Thrid way to create array
        int [] stillnumbers = new int[]{1,2,3};

        //compilation error, can't take int[], must be Integer[] or integers
        //List<Integer> myList = Arrays.asList(anothernums);

        List<Integer> myList = Arrays.asList(1,2,3,4,5);

        //Runtime Exception: UnsupportedOperationException, since myList is backed up by array and it's fixed size.
        //myList.add(6);

        //However, you can modify an element
        myList.set(1,4);

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        myList.forEach(p -> System.out.println(p));


    }
}
