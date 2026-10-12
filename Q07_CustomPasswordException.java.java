import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q07_CustomPasswordException {
    static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 6) {
            throw new InvalidPasswordException("Password must contain at least 6 characters.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            validatePassword(password);
            System.out.println("Password accepted.");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
