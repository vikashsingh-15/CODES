// package JAVA.CODES.CODES.InterviewBit.Array;


/*Maximum Sum Triplet
Medium

249

34

Add to favorites
Asked In:
DIRECTI
Problem Description

Given an array A containing N integers.

You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.

If no such triplet exist return 0.



Problem Constraints
3 <= N <= 105.

1 <= A[i] <= 108.



Input Format
First argument is an integer array A.



Output Format
Return a single integer denoting the maximum sum of triplet as described in the question.



Example Input
Input 1:

 A = [2, 5, 3, 1, 4, 9]
Input 2:

 A = [1, 2, 3]


Example Output
Output 1:

 16
Output 2:

 6


Example Explanation
Explanation 1:

 All possible triplets are:-
    2 3 4 => sum = 9
    2 5 9 => sum = 16
    2 3 9 => sum = 14
    3 4 9 => sum = 16
    1 4 9 => sum = 14
  Maximum sum = 16
Explanation 2:

 All possible triplets are:-
    1 2 3 => sum = 6
 Maximum sum = 6


Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. */
import java.util.*;

public class MaximumSumTriplet4 {
    public static int solve(int[] Arr) throws Exception {
        int ans = 0;
        int n = Arr.length;
        int B[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                B[i] = Arr[i];
            } else {
                B[i] = Math.max(Arr[i], B[i + 1]);
            }
        }

        TreeSet<Integer> lowervalue = new TreeSet<>();
        lowervalue.add(Arr[0]);

        for (int i = 1; i < n - 1; i++) {
            lowervalue.add(Arr[i]);
            if (lowervalue.lower(Arr[i]) != null && B[i + 1] > Arr[i]) {
                ans = Math.max(ans, (lowervalue.lower(Arr[i]) + Arr[i] + B[i + 1]));
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
       
        int sol = solve(Arr);
        System.out.println(sol);
    }

}
