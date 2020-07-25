package basic;

/*
2 ways to create a thread:

1. Implement Runnable
2. Extend Thread
 */
public class CreateThread {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();

        Thread t11 = new Thread(t1);
        t11.start();
        //call t11.start() again will throw IllegalThreadStateException
        MyThread2 t2 = new MyThread2();
        t2.start();
        new Thread(() -> {Thread t =Thread.currentThread();
            System.out.println(t.getName());
            System.out.println(t.getId());
        }).start();
    }
}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread1");
    }
}

class MyThread2 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread2");
    }
}
