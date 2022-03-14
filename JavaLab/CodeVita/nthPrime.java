import java.util.*;

public class nthPrime {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println(num);
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n == 2 || n == 3 || n == 5) {
            // System.out.println(n);
            return true;
        }
        if (n % 2 == 0) {
            return false;
        } else if (n % 3 == 0) {
            return false;
        }
        else if (n % 5 == 0) {
            return false;
        }
        for (int i = 6; i * i <= n; i = i + 6) {
            if (n % (i - 1) == 0 || n % (i + 1) == 0) {
                return false;
            }
        }
        // System.out.println(n);
        return true;
    }

}
