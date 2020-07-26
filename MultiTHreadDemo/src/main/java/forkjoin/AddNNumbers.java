package forkjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class MyTask extends RecursiveTask<Integer> {
    private static final int TASK_SIZE = 10;
    private int[] arr;
    int left, right;
    public MyTask(int[] arr, int left, int right){
        this.left = left;
        this.right = right;
        this.arr = arr;
    }

    private List<MyTask> createSubTasks(MyTask task){
        List<MyTask> taskList = new ArrayList<>();
        taskList.add(new MyTask(arr,task.left,task.left+(task.right-task.left)/2));
        taskList.add(new MyTask(arr,task.left+(task.right-task.left)/2,task.right));
        return taskList;
    }
    @Override
    protected Integer compute() {
        if(right -left>TASK_SIZE){
            List<MyTask> subtasks = createSubTasks(this);
            invokeAll(subtasks);
            int result =0;
            for(MyTask task: subtasks){
                result +=task.join();
            }
            return result;
        }else{

            int result = IntStream.range(left,right).map(i ->arr[i]).sum();
            return result;

        }
    }
}

/**
 * Add N numbers using forkjoin pool
 */
public class AddNNumbers {
    private static int PROBLEM_SIZE=10000;

    public static void main(String[] args){
        int[] data = new int[PROBLEM_SIZE];
        data = Arrays.stream(data).map(i -> {
            //Random r = new Random();
            //int x = r.nextInt(100);
            //i = x;
            i=1;
            return i;
        }).toArray();
        //IntStream.of(data).forEach(System.out::println);

        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new MyTask(data,0,data.length));
        System.out.println(result);

    }
}
