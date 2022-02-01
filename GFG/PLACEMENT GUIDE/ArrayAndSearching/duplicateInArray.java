import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
         ArrayList<Integer> arrlist=new ArrayList<>();
         for(int i=0;i<n;i++){
             int index=arr[i]%n;
             arr[index]+=n;
         }
         
         
         boolean flag=false;
          for(int i=0;i<n;i++){
             if(arr[i]/n>1){
                 arrlist.add(i);
                 flag=true;
             }
             
         }   
         
         if(!flag) arrlist.add(-1);
         
         return arrlist;
         
        //  for(int i=0;i<arr.length;i++){
        //      int index=Math.abs(arr[i])-1;
        //      int val=arr[index];
             
        //      if(val>=0){
        //          arr[index]=arr[index]*-1;
        //          }
        //      else if(arrlist.contains(index)==false && val<0){
        //          arrlist.add(index+1);
        //      }
         
    // }

}
}
