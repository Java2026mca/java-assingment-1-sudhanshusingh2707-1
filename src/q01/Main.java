import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");

            System.out.print("*");
            if (i > 1) {
                for (int s = 1; s <= 2*i - 3; s++) System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");

            System.out.print("*");
            if (i > 1) {
                for (int s = 1; s <= 2*i - 3; s++) System.out.print(" ");
                System.out.print("*");
            }

            if (i > 1) System.out.println();
        }
    }
}
