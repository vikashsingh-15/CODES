import java.util.*;
public class tappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        long sol=trappingWater(a, n);
        System.out.println(sol);
    }

        static long trappingWater(int arr[], int n) { 
            int leftMax[] =new int[n];
            int rightMax[] =new int[n];
            long water=0;
            leftMax[0]=arr[0];
            rightMax[n-1]=arr[n-1];
            
            for(int i=1;i<arr.length;i++){
                leftMax[i]=Math.max(arr[i],leftMax[i-1]);
            }
            
            for(int i=n-2;i>=0;i--){
                rightMax[i]=Math.max(arr[i],rightMax[i+1]);
            }
            
            for(int i=0;i<n;i++){
                water+=Math.min(rightMax[i],leftMax[i])-arr[i];
            }
            return water;
                
        } 
    }
    
    

