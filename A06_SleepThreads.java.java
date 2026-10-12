public class A06_SleepThreads {
    public static void main(String[] args) {
        Thread sleeper = new Thread(() -> {
            try {
                System.out.println("Sleeper: going to sleep for 2 seconds.");
                Thread.sleep(2000);
                System.out.println("Sleeper: awake now.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sleeper interrupted.");
            }
        });

        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Worker continues: " + i);
            }
        });

        sleeper.start();
        worker.start();
    }
}
