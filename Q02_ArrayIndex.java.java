import java.util.Scanner;

public class Q02_ArrayIndex {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value: " + values[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index must be between 0 and 4.");
        } finally {
            sc.close();
        }
    }
}
