package e.synchronization;

public class MathUtils {

    /**
     * Everytime a multiple its printed, the current Thread sleeps for 400 milliseconds, so the other Threads execute
     * and then the other thread also sleeps for 400 milliseconds, so the first thread uses the processor and executes
     */
    void getNextFiveMultiples(int n) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(n + "*" + i + " = " + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    /**
     * It's also possible to use a synchronized bloack
     * as follows:
     * void getNextFiveMultiplesSyncro(int n) {
     * synchronized(this)
     * {for (int i = 1; i <= 5; i++) {
     * System.out.println(n + "*" + i + " = " + n * i);
     * try {
     * Thread.sleep(400);
     * } catch (Exception e) {
     * System.out.println(e);
     * }
     * } }}
     */
    synchronized void getNextFiveMultiplesSyncro(int n) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(n + "*" + i + " = " + n * i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
