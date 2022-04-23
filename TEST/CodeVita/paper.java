import java.io.*;
import java.util.*;

public class paper {
    public static void paperMatch(String str) {
        int n = factorial(str.length());
        int[][] arr = new int[n][str.length()];
        for (int i = 0; i < n; i++) {
            StringBuilder s = new StringBuilder(str);
            int divident = i;
            for (int j = str.length(); j >= 1; j--) {
                int quotient = divident / j;
                int remainder = divident % j;
                arr[i][str.length() - j] = Character.getNumericValue(s.charAt(remainder));
                divident = quotient;
                s.deleteCharAt(remainder);
            }
        }
        int count = 0;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < str.length(); j++) {
    //             System.out.print(arr[i][j]);
    //         }
    //         System.out.println();
    //     }
    //    // System.out.println("count");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (arr[i][j] == j + 1)
                {
                    count++;
                    break;
                }
            }
        }
       System.out.println(count);

    }

    public static int factorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans =ans* i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        for (int i = 1; i <= n; i++) {
            str = str + i;
        }
        paperMatch(str);
    }

}
