public class Q09_FinallyReturn {
    static int getValue() {
        try {
            System.out.println("Inside try: preparing to return.");
            return 100;
        } finally {
            System.out.println("Inside finally: this runs before the method returns.");
        }
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println("Returned value: " + value);
    }
}
