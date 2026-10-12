public class Q04_NestedTry {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int numerator = 100;
        int denominator = 0; // Change to a non-zero value to test division.

        try {
            System.out.println("Outer try: division");
            int result = numerator / denominator;
            System.out.println("Division result: " + result);

            try {
                System.out.println("Inner try: array access");
                System.out.println("Array value: " + values[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: invalid array index.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: cannot divide by zero.");
        }
    }
}
