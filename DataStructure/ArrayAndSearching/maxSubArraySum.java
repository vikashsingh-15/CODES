// { Driver Code Starts
    //Initial Template for Java
    
    import java.io.*;
    import java.util.*;
    public class maxSubArraySum
    {
        public static void main(String args[])
            {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-->0)
                    {
                        int n;
                        n = sc.nextInt();
                        ArrayList<Integer> arr = new ArrayList<Integer>();
                        for(int i = 0;i<n;i++)
                            {
                                int p = sc.nextInt();
                                arr.add(p);
                            }
                            
                        Sol obj = new Sol();  
                        System.out.println(obj.maxSubArray(arr));  
                        
                    }
            }
    }
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    class Sol
    {
        
        public static int maxSubArray(ArrayList<Integer> array)
        {
            int n=array.size();
            int sum=array.get(0);
            int max=array.get(0);
            // ArrayList<Integer> list=new ArrayList<>();
            for(int i=1;i<n;i++){
                int p=array.get(i);
                // list.add(p);
                if(sum>=0){
                    sum=sum+p;
                }else{
                    sum=p;
                }
                
                max=Math.max(sum,max);
            }
        // System.out.println(list);
            return max;
            
        }
    }