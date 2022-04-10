/* 6. K-th element of two sorted Arrays 
Medium Accuracy: 50.09% Submissions: 39942 Points: 4
Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
Example 2:
Input:
arr1[] = {100, 112, 256, 349, 770}
arr2[] = {72, 86, 113, 119, 265, 445, 892}
k = 7
Output:
256
Explanation:
Final sorted array is - 72, 86, 100, 112,
113, 119, 256, 265, 349, 445, 770, 892
7th element of this array is 256.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function kthElement() which takes the arrays arr1[], arr2[], its size N and M respectively and an integer K as inputs and returns the element at the Kth position.


Expected Time Complexity: O(Log(N) + Log(M))
Expected Auxiliary Space: O(Log (N))


Constraints:
1 <= N, M <= 106
1 <= arr1i, arr2i < INT_MAX
1 <= K <= N+M*/
    
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    class GFG {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                StringTokenizer stt = new StringTokenizer(br.readLine());
                
                int n = Integer.parseInt(stt.nextToken());
                int m = Integer.parseInt(stt.nextToken());
                int k = Integer.parseInt(stt.nextToken());
                int a[] = new int[(int)(n)];
                int b[] = new int[(int)(m)];
                
                
                String inputLine[] = br.readLine().trim().split(" ");
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(inputLine[i]);
                }
                String inputLine1[] = br.readLine().trim().split(" ");
                for (int i = 0; i < m; i++) {
                    b[i] = Integer.parseInt(inputLine1[i]);
                }
                
                
                Solution obj = new Solution();
                System.out.println(obj.kthElement( a, b, n, m, k));
                
            }
        }
    }
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    
    class Solution {
        public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
            
            
            int[] sortedArray=mergeTwoSortedArray(arr1,arr2);
            long p=(long) sortedArray[k-1];
            return p;
            
            
            
            
            
        }
        
         public static int[] mergeTwoSortedArray(int[] a, int[] b) {
            int i = 0, j = 0, k = 0;
            int[] c = new int[a.length + b.length];
            while (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    c[k] = a[i];
                    i++;
                    k++;
                } else { // b[j]<a[i]
                    // count=count+(a.length-i);
                    c[k] = b[j];
                    j++;
                    k++;
                }
            }
            while (i < a.length) {
                c[k] = a[i];
                k++;
                i++;
            }
            while (j < b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
            return c;
    }
        
        
        
    }