// { Driver Code Starts
    import java.util.*;


    // } Driver Code Ends
   
   
   class smallestPositiveMissingNumber
   {
       //Function to find the smallest positive number missing from the array.
       static int missingNumber(int arr[], int size)
       {
        
        int index=0;
        int val=0;
        int ans=0;
           boolean one=false;   
           for(int i=0;i<size;i++){
               if(arr[i]==1){
                       one=true;
                   }
               if(arr[i]>size || arr[i]<1){
                   arr[i]=1;
               }
           }
           
           //  System.out.println("---------------");
           
           // for(int i=0;i<size;i++){
           //     System.out.print(arr[i]+" ");
           // }
           
           //   System.out.println();
            
           if( one==false){
               return 1;
           }
         else{
               for(int i=0;i<size;i++){
                   index=Math.abs(arr[i])-1;
                   val=arr[index];
                 if(val>=1){
                    arr[index]=arr[index]*-1;
                    }
               }
               
           //      System.out.println("---------------");
           
           // for(int i=0;i<size;i++){
           //     System.out.print(arr[i]+" ");
           // }
               
               for(int i=0;i<size;i++){
                   if(arr[i]>=1){
                       ans =i+1;
                       // System.out.println("ans is "+ans);
                       break;
                   }
               }
               
               
           }
           if(ans==0){
               return size+1;
           }else{
           return ans;
           }
       
       
       
       
       
       
           // int num=arr[0];
           // for(int i=1;i<arr.length;i++){
           //     if(arr[i]<num && arr[i]>0){
           //         num=arr[i];
           //     }else{
           //         if(arr[i]==num+1){
           //             num=arr[i];
           //         }
           //     }
               
               
           // }
           // return num+1;
       }
   }
   
   
   // { Driver Code Starts.
   
   class Main
   {   
       public static void main (String[] args) 
       {
   
           Scanner sc=new Scanner(System.in);
           
           //taking testcases
           int t=sc.nextInt();
           while(t-->0){
               
               //input number n
               int n=sc.nextInt();
               int[] arr=new int[n];
               
               //adding elements to the array
               for(int i=0;i<n;i++)
                   arr[i]=sc.nextInt();
                   
               Solution obj = new Solution();
               
               //calling missingNumber()
               int missing = obj.missingNumber(arr,n);
               System.out.println(missing);
           }
       }
   }
   
     // } Driver Code Ends