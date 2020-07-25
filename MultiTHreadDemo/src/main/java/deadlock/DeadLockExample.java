package deadlock;

public class DeadLockExample {
    public static DeadLockExample L1 = new DeadLockExample();
    public static DeadLockExample L2 = new DeadLockExample();
    public static void main(String[] args){
        new Thread(){
            public void run(){
                synchronized (L1){
                    System.out.println("t1 got L1");
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (L2){
                        System.out.println("t1 got L2");
                    }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                synchronized (L2){
                    System.out.println("t2 got L2");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (L1){
                        System.out.println("t2 got L1");
                    }
                }
            }
        }.start();
    }
}
