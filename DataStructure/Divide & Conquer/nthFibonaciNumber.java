/*2. The Nth Fibonnaci 
Easy Accuracy: 38.12% Submissions: 3818 Points: 2
Given a positive integer N, find the last digit of the Nth term from the Fibonacci series.
 

Example 1:

Input:
N = 5
Output:
5
Explanation:
5th Fibonacci number is 5
Example 2:

Input:
N = 14
Output:
7
Explanation:
14th Fibonacci number is 377
It's last digit is 7

Your Task:
You don't need to read input or print anything. Your task is to complete the function fib() which takes an integer N as input parameter and returns the last digit of Nth Fibonacci number.

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 1000 */


// Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    
    // compute reverse of a number
    public static long rev(long n)
    {
        long rev_num = 0;
         while(n > 0) 
          { 
            rev_num = rev_num*10 + n%10; 
            n = n/10; 
          } 
          return rev_num;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
        //testcases
		int T=sc.nextInt();
		while(T-->0)
		{
		    Solution obj=new Solution();
		    
		    int N;
		    
		    
            //input N
		    N=sc.nextInt();
		    int R=0;
		    
		    	    
            // reverse the given number n
		    R=(int)rev(N);
	
            //power of the number to it's reverse
		    long ans=(long)obj.power(N,R);
		    System.out.println(ans);
		    
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
      long power(int N,int R)
    {
        //Your code here
        return pR(N,R)%1000000007;
    }
    
    long pR(int N,int R){
        if(R==0){
            return 1;
        }
        long result=power(N,R/2);
         result = (result*result)%1000000007;
        if(R%2 == 0)
            return result;
        else
            return result*N;
    }

}
