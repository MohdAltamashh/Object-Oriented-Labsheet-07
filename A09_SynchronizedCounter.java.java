class SafeCounter {
    private int counter = 0;

    synchronized void increment() {
        counter++;
    }

    int getValue() {
        return counter;
    }
}

public class A09_SynchronizedCounter {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected counter: 200000");
        System.out.println("Actual counter: " + counter.getValue());
    }
}
