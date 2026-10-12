class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = Math.max(0, balance);
    }

    void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient account balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful: " + amount);
    }

    double getBalance() {
        return balance;
    }
}

public class Q10_BankingExceptions {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1200);
        } catch (InsufficientFundsException e) {
            System.out.println("Banking error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }

        try {
            account.withdraw(-100);
        } catch (InsufficientFundsException e) {
            System.out.println("Banking error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        }

        System.out.println("Current balance: " + account.getBalance());
    }
}
