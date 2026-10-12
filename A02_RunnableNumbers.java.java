class NumberTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class A02_RunnableNumbers {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberTask(), "NumberThread");
        thread.start();
    }
}
