import java.util.*;

public class consecutivePrime {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            if (isPrime(j)) {
                sum += j;
                if(sum>3 && sum<=n){
                   if(isPrime(sum)){
                       System.out.println(sum);
                       count++;
                   }
                }
            }
        }
        System.out.println("count = "+count);
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3 || n == 5) {
            // System.out.println(n);
            return true;
        }
        if (n % 2 == 0) {
            return false;
        } else if (n % 3 == 0) {
            return false;
        } else if (n % 5 == 0) {
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
