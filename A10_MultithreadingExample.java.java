public class A10_MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
        Thread payment = new Thread(() -> {
            System.out.println("Payment thread: verifying payment...");
            try { Thread.sleep(500); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println("Payment thread: payment verified.");
        }, "PaymentThread");

        Thread inventory = new Thread(() -> {
            System.out.println("Inventory thread: checking stock...");
            try { Thread.sleep(300); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println("Inventory thread: stock reserved.");
        }, "InventoryThread");

        Thread receipt = new Thread(() -> {
            System.out.println("Receipt thread: preparing order receipt...");
            try { Thread.sleep(200); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println("Receipt thread: receipt prepared.");
        }, "ReceiptThread");

        payment.start();
        inventory.start();
        receipt.start();

        payment.join();
        inventory.join();
        receipt.join();
        System.out.println("Order processing tasks completed.");
    }
}
