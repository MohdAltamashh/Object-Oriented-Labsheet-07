public class A07_JoinThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("First thread: " + i);
            }
        });

        Thread second = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Second thread: " + i);
            }
        });

        first.start();
        first.join(); // Main thread waits for first to finish.
        second.start();
        second.join();
        System.out.println("Both threads have finished.");
    }
}
