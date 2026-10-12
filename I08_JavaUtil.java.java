import java.util.ArrayList;
import java.util.Scanner;

public class I08_JavaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("Names stored in ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}
