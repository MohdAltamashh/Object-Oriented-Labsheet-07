class MessageThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": Hello, Java thread! (" + i + ")");
        }
    }
}

public class A01_ThreadExtends {
    public static void main(String[] args) {
        MessageThread thread = new MessageThread();
        thread.start();
    }
}
