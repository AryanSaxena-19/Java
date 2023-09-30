package Java.study;

import java.util.Random;

class MyCounter implements Runnable {
    private final int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(int i=0;i<=9;i++){
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("The value pf i is: "+i+" and the thread number is: "+threadNo);
        }
    }
}

public class App {
    public static void main(String[] args) {
      /*  Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 = new Thread(new MyCounter(2));
        thread1.start();
        thread2.start();
         */

        Thread thread = new Thread((new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<10;i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }

            }
        }));
        thread.start();
    }
}
