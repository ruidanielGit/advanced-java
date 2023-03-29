package d.concurrency;

import e.synchronization.MathUtils;

public class Thread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Thread 2 is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
