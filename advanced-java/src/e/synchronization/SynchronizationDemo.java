package e.synchronization;

public class SynchronizationDemo {

    public static void main(String[] args) {

        MathUtils mu = new MathUtils();

        Thread1 thread1 = new Thread1(mu);
        Thread2 thread2 = new Thread2(mu);

        thread1.start();
        thread2.start();
    }
}
