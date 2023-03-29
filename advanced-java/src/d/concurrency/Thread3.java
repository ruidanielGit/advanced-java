package d.concurrency;

public class Thread3 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread 3 is running");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
