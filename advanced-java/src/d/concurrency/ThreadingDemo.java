package d.concurrency;

public class ThreadingDemo {

    /**
     * There are two ways of creating Threads, extending Thread class or implementing the Runnable Interface
     * <p>
     * Threads never run in sequence, they run in parallel
     * There is no guarantee of order
     */
    public static void main(String[] args) {

        int numOfThreads = 10;

        for (int i = 0; i < numOfThreads; i++) {
            Thread1 thread1 = new Thread1(); //extends Thread
            Thread2 thread2 = new Thread2(); //extends Thread
            Thread3 thread3 = new Thread3(); //implements Runnable

            thread1.start();
            thread2.start();
            thread3.run();
        }
    }
}
