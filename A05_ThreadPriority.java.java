class PriorityTask extends Thread {
    PriorityTask(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " (priority " + getPriority() + ")");
        }
    }
}

public class A05_ThreadPriority {
    public static void main(String[] args) {
        Thread low = new PriorityTask("Low", Thread.MIN_PRIORITY);
        Thread normal = new PriorityTask("Normal", Thread.NORM_PRIORITY);
        Thread high = new PriorityTask("High", Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
        System.out.println("Priority is a scheduling hint; it does not guarantee execution order.");
    }
}
