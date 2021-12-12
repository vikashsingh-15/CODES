/*NUMRANGE
Easy

11

6

Add to favorites
Given an array of non negative integers A, and a range (B, C), 

find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]

where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3 

as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

NOTE : The answer is guranteed to fit in a 32 bit signed integer. */

import java.util.*;


public class numberRange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int[] c = new int[k];
        for(int c_i=0; c_i < k; c_i++){
            c[c_i] = in.nextInt();
        }
        int[] result = solve(a, b, c);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("\n");
    }

    public static int[] solve(int[] a, int[] b, int[] c) {
        int[] result = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] <= c[i] && c[i] <= b[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
    
}
