import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            boolean isPrime = checkPrime(num);
            boolean isPerfect = checkPerfect(num);

            if (isPrime && isPerfect) {
                System.out.println("Both");
            } else if (isPrime) {
                System.out.println("Prime");
            } else if (isPerfect) {
                System.out.println("Perfect");
            } else {
                System.out.println("Neither");
            }
        }

        sc.close();
    }

    // Check Prime
    public static boolean checkPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check Perfect Number
    public static boolean checkPerfect(int num) {
        if (num <= 1) return false;

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }
}
