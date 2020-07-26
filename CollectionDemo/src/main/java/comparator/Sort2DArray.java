package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sort2DArray {
    public static void main(String[] args){
        int[][] matrix={{1,7,3},{4,5,6},{7,8,9}};
        Arrays.sort(matrix, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[1] - b[1];
            }
        });
        Arrays.stream(matrix).flatMap(value ->
                Arrays.stream(value).boxed()
        ).forEach(System.out::println);
    }
}
