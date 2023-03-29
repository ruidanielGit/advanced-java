package e.synchronization;

public class Thread2 extends Thread {

    MathUtils mu;

    public Thread2(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            /*mu.getNextFiveMultiples(2);*/ //here there will be no order, both threads will execute
            mu.getNextFiveMultiplesSyncro(2); //here there will be order, only one thread will execute
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
