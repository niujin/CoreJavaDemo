package catchexception;

public class CatchExceptionFromThread {

    public static void main(String[] args){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run(){
                throw new RuntimeException("Test Exception");
            }

        });
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Thread: "+t.getName()+"  Exception: "+e.getMessage());
            }
        });
        t1.start();
    }

}
