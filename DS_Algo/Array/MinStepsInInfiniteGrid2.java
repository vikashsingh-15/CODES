// package JAVA.CODES.CODES.InterviewBit.Array;

/*Min Steps in Infinite Grid
Easy

150

26

Add to favorites
Asked In:
DIRECTI
AMAZON
Problem Description

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x-1, y-1), 
    (x-1, y)  , 
    (x-1, y+1), 
    (x  , y-1),
    (x  , y+1), 
    (x+1, y-1), 
    (x+1, y)  , 
    (x+1, y+1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.



Input Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



Output Format
Return an Integer, i.e minimum number of steps.



Example Input
Input 1:

 A = [0, 1, 1]
 B = [0, 1, 2]


Example Output
Output 1:

 2


Example Explanation
Explanation 1:

 Given three points are: (0, 0), (1, 1) and (1, 2).
 It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).


Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. */
import java.util.*;

public class MinStepsInInfiniteGrid2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int Brr[] = new int[m];
        for (int i = 0; i < n; i++) {
            Brr[i] = sc.nextInt();
        }
        int sol = coverPoints(Arr, Brr);// Note: it was important to have solve class as Static without that it will
                                  // cause error.
        System.out.println(sol);
    }

    public static int coverPoints(int[] Arr, int[] Brr) {

        int count1 = 0;
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < (Math.max(Arr.length, Brr.length)) - 1; i++) {
            count1 = Math.abs(Arr[i] - Arr[i + 1]);
            count2 = Math.abs(Brr[i] - Brr[i + 1]);

            count = count + Math.max(count1, count2);
        }
        return count;
    }

}
