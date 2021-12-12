//QUESTION

// Water the plants
// Accuracy: 60.75% Submissions: 341 Points: 60
// A gallery with plants is divided into n parts, numbered :0,1,2,3...n-1.
// There are provisions for attaching water sprinklers at every partition.
// A sprinkler with range xat partition i can water all partitions from i-x
// to i+x.
// Given an array gallery [] consisting of n integers, where gallery [i] is
// the range of sprinkler at partition i (power-=-1 indicates no sprinkler
// attached), return the minimum number of sprinklers that need to be
// turned on to water the complete gallery.
// If there is no possible way to water the full length using the given
// sprinklers, print-1.

/*
Input:
n = 6
gallery[ ] = {-1, 2, 2, -1, 0, 0}
Output:
2
Explanation: Sprinklers at index 2 and 5
can water thefull gallery, span of
sprinkler at index 2 = [0,4] and span
of sprinkler at index 5 = [5,5].

Input:
n = 9
gallery[ ] = {2, 3, 4, -1, 2, 0, 0, -1, 0}
Output:
-1
Explanation: No sprinkler can throw water
at index 7. Hence all plants cannot be
watered.

Input:
n = 9
gallery[ ] = {2, 3, 4, -1, 0, 0, 0, 0, 0}
Output:
3
Explanation: Sprinkler at indexes 2, 7 and
8 together can water all plants.

*/









// { Driver Code Starts
//Initial Template for Java

import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());
            
            int gallery[] = new int[n];
            for(int i=0; i<n; i++)
                gallery[i] = Integer.parseInt(sc.next());
            Solution T = new Solution();
            System.out.println(T.min_sprinklers(gallery,n));
        }
		
		
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    void min_sprinklers(int gallery[], int n)
    {
        int l=n;
        int p=0;
        while(l<=0)
        {
            int x=gallery[p];
            
            if(x==-1)
            {
              p++;
            }
           else{
            int left=p-x;
            int right=p+x;

           }


            
        }





   
      
    }
}
