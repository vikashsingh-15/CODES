/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)
 */

import java.util.*;

class longestConsecutiveSequenceOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> hash = new HashMap<>();
        for (int val : arr) {
            hash.put(val, true);
        }

        for (int val : arr) {
            if (hash.containsKey(val - 1)) {
                hash.put(val, false);
            }

        }

        int maxlength = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (hash.get(arr[i]) == true) {
                int tl = 1;
                int tstart = arr[i];
                while (hash.containsKey(arr[i] + tl)) {
                    tl++;
                }
                if (tl > maxlength) {
                    start = tstart;
                    maxlength = tl;
                }
            }
        }

        for (int i = 0; i < maxlength; i++) {
            System.out.println((start + i));
        }
    }
}
