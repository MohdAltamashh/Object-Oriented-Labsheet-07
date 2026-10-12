class NamedTask extends Thread {
    NamedTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " prints " + i);
        }
    }
}

public class A04_TwoThreads {
    public static void main(String[] args) {
        NamedTask first = new NamedTask("Thread-A");
        NamedTask second = new NamedTask("Thread-B");
        first.start();
        second.start();
    }
}
