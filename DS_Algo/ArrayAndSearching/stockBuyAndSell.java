// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class stockBuyAndSell {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int A[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                A[i] = Integer.parseInt(inputLine[i]);
            }
            int p = 0;
            for(int i=0; i<n-1; i++)
                p += Math.max(0,A[i+1]-A[i]);
                
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer> > ans = obj.stockBuySell(A, n);
            if(ans.size()==0)
                System.out.print("No Profit");
            else{
                int c=0;
                for(int i=0; i<ans.size(); i++)
                    c += A[ans.get(i).get(1)]-A[ans.get(i).get(0)];
                
                if(c==p)
                    System.out.print(1);
                else
                    System.out.print(0);
            }System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        
        
        // int profit=0;
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>arr[i-1]){
        //         profit=profit+(arr[i]-arr[i-1]);
        //     }
        // }
        // return profit;
       ArrayList< ArrayList<Integer>> list=new ArrayList< ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        
    
     
        int apoint=0;
        int bpoint=0;
        int s=0;
      
        
       
      if(n==2){
           if(arr[0]<arr[1]){
                 al.add(0);
                al.add(1);
                list.add(al);
                return list;
               
           }else{
               return list;
           }
                
           
      }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                s++;
                bpoint++;
            }
            else{
                    al.add(apoint);
                    al.add(bpoint);
                    list.add(al);
                    al=new ArrayList<>();
                apoint=bpoint=i;
                
            }
        }
        if(s==0){
            return list=new ArrayList< ArrayList<Integer>>();
        }else{
                    al.add(apoint);
                    al.add(bpoint);
                    list.add(al);
        
        }
               
        
        // System.out.println(list);
        return list;
        
    }
}
