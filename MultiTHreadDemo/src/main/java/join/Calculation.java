package signal.join;

import java.util.Scanner;

public class Calculation {
    static int x, y,z,k,m;
    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1....");
                z = x*y;
                System.out.println("x*y"+z);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2....");
                k = x+y;
                System.out.println("x+y"+k);
            }
        });

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x:");
        x = scanner.nextInt();
        System.out.println("Input y:");
        y = scanner.nextInt();
        t1.start();
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(z);
        System.out.println(k);
        m = z/k;
        System.out.println(m);

    }
}
