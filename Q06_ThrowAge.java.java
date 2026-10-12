import java.util.Scanner;

public class Q06_ThrowAge {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age accepted.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
