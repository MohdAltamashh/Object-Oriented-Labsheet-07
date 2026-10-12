import java.util.Scanner;

public class Q08_ThrowsNumberFormat {
    static int readNumber(String text) throws NumberFormatException {
        return Integer.parseInt(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            String text = sc.nextLine();
            int number = readNumber(text);
            System.out.println("Integer value: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
        } finally {
            sc.close();
        }
    }
}
