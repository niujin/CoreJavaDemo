package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {
    public static void main(String[] args){
        int[] data = {1,2,3};
        String[] strings = {"1","2","3"};
        //if data is primitive, then Arrays.stream() will create a primitive Stream, otherwise it will be Stream
        //Compile error, it returns an IntStream
        //Stream stream = Arrays.stream(data);
        IntStream intStream = Arrays.stream(data);

        Stream<String> stringStream = Arrays.stream(strings);

        //Convert IntStream to Stream<Integer>
        Stream<Integer> integerStream= intStream.boxed();

        //Convert Stream<Integer> to IntStream
        intStream = integerStream.mapToInt(Integer::intValue);
    }
}
