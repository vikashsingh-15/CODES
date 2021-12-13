/*8. Nearly sorted 
Medium Accuracy: 60.52% Submissions: 9994 Points: 4
Given an array of n elements, where each element is at most k away from its target position, you need to sort the array optimally.

Example 1:

Input:
n = 7, k = 3
arr[] = {6,5,3,2,8,10,9}
Output: 2 3 5 6 8 9 10
Explanation: The sorted array will be
2 3 5 6 8 9 10
Example 2:

Input:
n = 5, k = 2
arr[] = {3,1,4,2,5}
Output: 1 2 3 4 5 
Note: DO NOT use STL sort() function for this question.

Your Task:
You are required to complete the method nearlySorted() which takes 3 arguments and returns the sorted array.

Expected Time Complexity : O(nlogk)
Expected Auxilliary Space : O(n) */



    import java.util.*;
    import java.io.*;
    import java.lang.*;
    
    class nearlySorted
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int num = sc.nextInt();
                int k = sc.nextInt();
                
                int arr[] = new int[num];
                for(int i = 0; i < num; i++)
                    arr[i] = sc.nextInt();
                
                ArrayList <Integer> res = new Solution().nearlySorted(arr, num, k);
                for (int i = 0; i < res.size (); i++)
                    System.out.print (res.get (i) + " ");
                System.out.println();
            }
        }
    }
    
    // } Driver Code Ends
    
    // java.util.PriorityQueue;
    class Solution
    {
        //Function to return the sorted array.
        ArrayList <Integer> nearlySorted(int arr[], int num, int k)
        {
            PriorityQueue <Integer> pq=new PriorityQueue<>();
              ArrayList<Integer> arrlist = new ArrayList<Integer>();
            
            
            for(int i=0;i<=k;i++){
                pq.add(arr[i]);
            }
            for(int i=k+1;i<arr.length;i++){
               arrlist.add(pq.remove());
                pq.add(arr[i]);
            }
            
            while(pq.size()>0){
              arrlist.add(pq.remove());
            }
            
            return arrlist;
        }
    }
    