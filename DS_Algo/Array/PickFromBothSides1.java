// package JAVA.CODES.CODES.InterviewBit.Array;

// //Question

// Pick from both sides!
// Asked In:
// MEDIA.NET
// Problem Description
// Given an integer array A of size N.
// You can pick B elements from either left or right end of the array A to get maximum sum.
// Find and return this maximum possible sum.
// NOTE: Suppose B = 4 and array A contains 10 elements then
// You can pick first four elements or can pick last four elements or can pick 1 from front and 3 from back etc . you need to return the maximum possible sum of elements you can pick.
// Problem Constraints
// 1 <= N <= 105
// 1 <= B <= N
// -103 <= A[i] <= 103
// Input Format
// First argument is an integer array A.
// Second argument is an integer B.
// Output Format
// Return an integer denoting the maximum possible sum of elements you picked.
// Example Input
// Input 1:
//  A = [5, -2, 3 , 1, 2]
//  B = 3
// Input 2:
//  A = [1, 2]
//  B = 1

// Example Output
// Output 1:
//  8
// Output 2:
//  2
// Example Explanation
// Explanation 1:
//  Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
// Explanation 2:
//  Pick element 2 from end as this is the maximum we can get




import java.util.*;
public class PickFromBothSides1 {


    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n]; 
        for(int i=0;i<n;i++)
        {
        Arr[i]=sc.nextInt();
        }
        int b = sc.nextInt();
        int sol = solve(Arr,b);//Note: it was important to have solve class as Static without that it will cause error.
        System.out.println(sol);
    }


        public static int solve(int[] A, int B) {
            int ans = 0, temp = 0;
            for(int i = 0; i<B; i++){
                ans = ans + A[i];
            }
            temp = ans;
            for(int i = 0; i<B; i++){
                temp = temp - A[B-i-1] + A[A.length-i-1];
                ans = Math.max(ans, temp);
            }
            return ans;
        }
    
    



    
    
}

