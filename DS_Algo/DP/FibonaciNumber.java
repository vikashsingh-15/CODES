import java.util.*;

public class FibonaciNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int fib = FibSum(n);
        // System.out.println(fib);

        // int fib = FibSum2(n);
        // System.out.println(fib);

        // int printfibo[] = printfibo(n);
        // for (int i = 1; i < n; i++) {
        // System.out.println(printfibo1[i]);
        // }

        // for(int i=0;i<n;i++){
        // System.out.println(PrintFibo2(i) + " ");
        // }

        for (int i = 0; i <n; i++)
            System.out.print(PrintFibo3(i) + " ");

        sc.close();
    }

    public static int FibSum(int n) {// recursion approach
        if (n == 0 || n == 1) {
            return n;
        }
        int fibn1 = FibSum(n - 1);
        int fibn2 = FibSum(n - 2);
        int fibn = fibn1 + fibn2;
        return fibn;
    }

    public static int FibSum2(int n){

        if (n == 0 || n == 1) {
            return n;
        }
        int a=0;
        int b=1;
        int sum=a+b;
        while(n>1){
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }
        return sum;
    }

    public static int[] printfibo1(int n) {

        if (n == 0 || n == 1) {
            int fib[] = new int[1];
            fib[0] = n;
            return fib;
        }
        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 0; i < n - 1; i++) {
            fibo[i + 2] = fibo[i] + fibo[i + 1];
        }
        return fibo;
    }

    static int PrintFibo2(int n) {// recusion
        if (n <= 1) {
            return n;
        } else {
            return PrintFibo2(n - 1) + PrintFibo2(n - 2);
        }
    }

    static int PrintFibo3(int n) {// DP

        if (n == 0 || n == 1) {
            int fib[] = new int[1];
            fib[0] = n;
            return fib[0];
        } else {
        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
  
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];

        }
    }

}
