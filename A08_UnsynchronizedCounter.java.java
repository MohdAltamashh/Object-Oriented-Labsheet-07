public class A08_UnsynchronizedCounter {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                counter++; // Not atomic; updates can be lost.
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Expected counter: 200000");
        System.out.println("Actual counter: " + counter);
        System.out.println("The actual result may vary; it is not guaranteed to be incorrect every run.");
    }
}
