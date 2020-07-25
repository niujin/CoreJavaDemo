package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]){
        createStreams();
        //streamToOthers();
        //intermediateOperation();
        //TerminalOperation();
    }

    /**
     * 1. stream.of()
     * 2. Collection.stream()
     * 3. generate and iterate
     * 4. Arrays.stream() and String.chars()
     * 5. Files.lines()
     * */
    public static void createStreams(){
        /*
        Stream<Integer> stream = Stream.of(new Integer[]{1,2,3});
        Stream<Integer> stream1 = Stream.of(1,2,3);
        //Doesn't support int[]
        //Stream<Integer> stream = Stream.of(new int[]{1,2,3});

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        Set<Integer> mySet = new HashSet<>(myList);

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1,1);
        Stream<Map.Entry<Integer,Integer>> mapStream = map1.entrySet().stream();

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();
        */

        //generate and iterate
        Stream<String> stream2 = Stream.generate(() -> "abc").limit(10);
        System.out.println(stream2.collect(Collectors.joining()));
        System.out.println(stream2.collect(Collectors.joining()));
        //Stream<String> stream3 = Stream.iterate("abc", (i) -> i + "a").limit(5);
        //System.out.println(stream3.collect(Collectors.joining()));
       // LongStream is = Arrays.stream(new long[]{1,2,3,4});
       // IntStream is2 = "abc".chars();

        //read file as stream
        String fileName = "lines.txt";

        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Use bufferedReader
        List<String> list = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            //br returns as stream and convert it into a List
            list = br.lines().collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }

    /**
     * 1.stream.collect() to convert stream to Collection or String
     * 2.stream.toArray() to convert stream to array
     */
    public static void streamToOthers(){

        //convert to list
        Stream<Integer> intStream = Stream.of(1,2,3,4);
        List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList);

        //stream can only be used once, will throw IllegalStateException if used again
        //List<Integer> intList1 = intStream.collect(Collectors.toList());
        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again

        //convert to map
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}

        //convert to array
        Stream<Integer> intStream1 = Stream.of(1,2,3,4);
        Integer[] intArray = intStream1.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]

        //convert to String
        Stream<String> stringStream = Stream.of("1","2","3","4");
        String result = stringStream.collect(Collectors.joining());
        System.out.println(result); //prints [1, 2, 3, 4]


    }

    public static void intermediateOperation(){

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();

        //Filter
        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90);

        //forEach() is a terminal operation
        highNums.forEach(p -> System.out.print(p+" "));


        //map
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println(names.map(s -> {
            return s.toUpperCase();
        }).collect(Collectors.toList()));

        //sorted
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

    }

    public static void TerminalOperation(){

        //reduce
        //first argument is the return value of the previous application and
        // second argument is the current stream element.
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        IntStream intStream = IntStream.of(1,2, new Integer(3));
        Optional<Integer> intOptional = numbers.reduce((i,j) -> {return i*j;});
        if(intOptional.isPresent())
            System.out.println("Multiplication = "+intOptional.get()); //120

        //Match
        Stream<Integer> numbers3 = Stream.of(1,2,3,4,5);
        System.out.println("Stream contains 4? "+numbers3.anyMatch(i -> i==4));
        //Stream contains 4? true

        //Find first
        Stream<String> names4 = Stream.of("Pankaj","Amit","David", "Lisa");
        Optional<String> firstNameWithD = names4.filter(i -> i.startsWith("D")).findFirst();
        if(firstNameWithD.isPresent())
            System.out.println("First Name starting with D="+firstNameWithD.get()); //David

    }
}
