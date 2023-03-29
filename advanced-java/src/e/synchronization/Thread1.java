package e.synchronization;


public class Thread1 extends Thread {

    MathUtils mu;

    public Thread1(MathUtils mu) {
        this.mu = mu;
    }

    @Override
    public void run() {
        try {
            /*mu.getNextFiveMultiples(5);*/ //here there will be no order, both threads will execute
            mu.getNextFiveMultiplesSyncro(5); //here there will be order, only one thread will execute
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
