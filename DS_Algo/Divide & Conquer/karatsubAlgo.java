/*Given two binary strings A and B that represent value of two integers, find the product of two strings in Decimal Value.

 

Example 1:

Input:
A = "1100" , B = "01"
Output:
12
Explanation:
Decimal representation of A is 12 and
that of B is 1. So, A*B gives the
output 12.
Example 2:

Input:
A = "01" , B = "01"
Output:
1
Explanation:
Decimal representation of both A and 
B is 1. So, A*B gives the output 1.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function karatsubaAlgo() which takes Strings A and B as input and returns the answer.

 

Expected Time Complexity: O(Length of Binary String)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= |A|,|B| <= 25 */




// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            String A = S[0];
            String B = S[1];

            Solution ob = new Solution();
            System.out.println(ob.karatsubaAlgo(A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long karatsubaAlgo(String A, String B) {
        // code here
        long decimal1=Long.parseLong(A,2);  
         long decimal2=Long.parseLong(B,2); 
         return (decimal1*decimal2);
        
        
        
        
    }
};