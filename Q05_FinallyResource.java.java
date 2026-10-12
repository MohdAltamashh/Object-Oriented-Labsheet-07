public class Q05_FinallyResource {
    public static void main(String[] args) {
        try {
            System.out.println("File opened");
            System.out.println("Performing an operation...");
            int result = 10 / 0; // Deliberately causes an exception.
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred during the operation.");
        } finally {
            System.out.println("Resource closed");
        }
    }
}
