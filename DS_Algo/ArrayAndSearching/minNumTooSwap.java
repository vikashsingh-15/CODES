 //{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class minNumTooSwap
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine().trim());
            while(T-->0)
            {
                int n = Integer.parseInt(br.readLine().trim());
                int[] nums = new int[n];
                String[] S = br.readLine().trim().split(" ");
                for(int i = 0; i < n; i++){
                    nums[i] = Integer.parseInt(S[i]);
                }
                Solution obj = new Solution();
                int ans = obj.minSwaps(nums);
                System.out.println(ans);
           }
        }
    }// } Driver Code Ends
    
    class Solution
    {
        //Function to find the minimum number of swaps required to sort the array.
        public int minSwaps(int nums[])
        {
            int n=nums.length;
            int ans=0;
            int [] temp=Arrays.copyOfRange(nums,0,n);
            Arrays.sort(temp);
            for(int i=0;i<n;i++){
                if(nums[i]!=temp[i]){
                    ans++;
                    swap(nums,i,indexOf(nums,temp[i]));
                }
            }
            
            return ans;
        }
            
            public void swap(int[] arr,int i,int j){
                int toSwap=arr[i];
                arr[i]=arr[j];
                arr[j]=toSwap;
            }
            
            public int indexOf(int [] arr,int element){
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==element){
                        return i;
                    }
                }
                return -1;
            }
        }