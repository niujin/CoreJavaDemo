package countdownlatch;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AddNNumbers {
    private static int TASK_SIZE = 10;
    private static int TOTAL_NUMBER = 1000;
    CountDownLatch latch = new CountDownLatch(TASK_SIZE);

    class CalculationTask implements Callable<Integer>{
        CountDownLatch latch;
        List<Integer> data;
        public CalculationTask(CountDownLatch latch, List<Integer> data){
            this.latch =latch;
            this.data =data;
        }

        public Integer call(){
            int result =0;
            try{
                result = data.stream().mapToInt(Integer::intValue).sum();
            }finally{
                latch.countDown();
            }

            return Integer.valueOf(result);
        }
    }

    public int calculate(List<Integer> data){
        List<List<Integer>> subSets = Lists.partition(data,TASK_SIZE);
        ExecutorService executor = Executors.newCachedThreadPool();
        int[] result = new int[TASK_SIZE];
        LongAdder adder = new LongAdder();
        subSets.forEach(list ->{
            Future<Integer> future = executor.submit(new CalculationTask(latch,list));
            try {
                adder.add(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        return adder.intValue();
    }


    public static void main(String[] args){
        List<Integer> data = IntStream.range(0,TOTAL_NUMBER).map(i -> 1).boxed().collect(Collectors.toList());
        //System.out.println(data.get(10));
        AddNNumbers calculator = new AddNNumbers();
        int result = calculator.calculate(data);
        System.out.println(result);
    }
}
