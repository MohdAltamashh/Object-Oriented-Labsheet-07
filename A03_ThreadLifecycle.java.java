public class A03_ThreadLifecycle {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(300);
                System.out.println("Worker thread is executing.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Worker");

        System.out.println("State after creation: " + worker.getState()); // NEW
        worker.start();
        System.out.println("State after start: " + worker.getState());   // Usually RUNNABLE
        Thread.sleep(100);
        System.out.println("State while sleeping: " + worker.getState()); // TIMED_WAITING
        worker.join();
        System.out.println("State after completion: " + worker.getState()); // TERMINATED
        System.out.println("Note: BLOCKED occurs when waiting to enter a synchronized monitor.");
    }
}
