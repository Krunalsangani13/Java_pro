package ExThread;

public class Thread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi!!");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate work
            } catch (InterruptedException e) {
                System.out.println("Thread1 interrupted.");
            }
        }
    }
}