package JAVA.CODES.CODES.leetCode14DayALgo;

public class isBadVersion {
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
            while(low<high){
                int mid = low + (high - low) / 2;   
                if(isBadVersion(mid)==false){
                    low=mid+1;
                }
                else{
                    high=mid;     
                }
            }
        return low;
       
    }
}

/*public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int minPosition=Integer.MAX_VALUE;
        int low=0;
        int high=n;
            while(low<=high){
                int mid=(low+high)/2; 
                
                if(isBadVersion(mid)==false){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                    minPosition=Math.min(minPosition,mid);
                }
            }
        return minPosition;
       
    }
} */
