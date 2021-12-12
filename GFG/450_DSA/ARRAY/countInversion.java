/*

15. Count Inversions 

Medium Accuracy: 39.43% Submissions: 100k+ Points: 4
Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.*/

// Driver Code Starts
//Initial Template for Java


import java.util.*;
class countInversion {

    static int count = 0;
    public static int[] merge(int[]left,int[]right) {
        
        int i=0;
        int j=0;
        int k=0;
        int[]merged = new int[left.length + right.length];
        
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                merged[k] = left[i];
                k++;
                i++;
            }
            else {
                count += (left.length-i);
                merged[k] = right[j];
                k++;
                j++;
            }
        }
        
        while(i < left.length) {
           merged[k] = left[i];
           k++;
           i++; 
        }
        
        while(j < right.length) {
            merged[k] = right[j];
            k++;
            j++;
        }
        
        return merged;
    }

    public static int[] mergeSort(int arr[],int lo,int hi) {
        if(lo == hi) {
            int[]ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        
        int mid = (lo + hi)/2;
        
        int[]left = mergeSort(arr,lo,mid);
        int[]right = mergeSort(arr,mid+1,hi);
        
        int[]merged = merge(left,right);
        
        return merged;
    }

    public static void main(String[]args) {
        //write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[]arr = new int[n];

        for(int i=0; i < n;i++) {
            arr[i] = scn.nextInt();
        }

        int[]ans = mergeSort(arr,0,n-1);
        System.out.println(count);
    }
}
                                
                                