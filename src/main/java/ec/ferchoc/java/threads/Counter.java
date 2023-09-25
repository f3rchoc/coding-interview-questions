package ec.ferchoc.java.threads;

public class Counter {

    private int a;

    public synchronized int increment() {
        int a = 0;
        a++;
        return a;
    }

    public static void main(String ... args) {

        Counter myCounter = new Counter();

        Thread thread1 = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("thread1: " + myCounter.increment());
            }

        });

        Thread thread2 = new Thread(() -> {

            for (int i = 0; i < 100; i++) {
                System.out.println("thread2: " + myCounter.increment());
            }

        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final Counter Value: " + myCounter.increment());


    }

}
