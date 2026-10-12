import java.util.Scanner;

public class Q03_MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first integer: ");
            String first = sc.nextLine();
            System.out.print("Enter second integer: ");
            String second = sc.nextLine();

            int a = Integer.parseInt(first);
            int b = Integer.parseInt(second);
            System.out.println("Result: " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid whole numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be zero.");
        } finally {
            sc.close();
        }
    }
}
