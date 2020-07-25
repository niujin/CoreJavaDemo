import java.util.Optional;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args){
        System.out.println(getSmallestAndLargest("welcometojava",3));
    }


        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";


            Optional<String> minValue = IntStream.iterate(0, i -> ++i).limit(s.length()-k+1).
                    mapToObj(i -> s.substring(i,i+k)).min((val1, val2) -> { return val1.compareTo(val2);});
            Optional<String> maxValue = IntStream.iterate(0, i -> ++i).limit(s.length()-k+1)
                    .mapToObj(i -> s.substring(i,i+k)).max((val1, val2) -> { return val1.compareTo(val2);});

            smallest = minValue.orElseGet(() -> "");
            largest = maxValue.orElse("");

            return smallest + "\n" + largest;
        }


    }

