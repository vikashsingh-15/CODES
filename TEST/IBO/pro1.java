import java.util.*;
class pro1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
            int b[]=new int[n];
            b=solve(n,a);
            for(int i=0;i<n;i++){
                System.out.print(b[i]+" ");
            }
    }

    public static int[] solve(int n,int arr[]){
       
        int ans[]=new int[n];
        int movePositive=n;
       int moveNegative=-1;

        for(int i=0;i<n;i++){
            int valAtPos=arr[i];
            // System.out.println("Position = "+i);
            // System.out.println("Value at Pos "+valAtPos);

        //    if(i+valAtPos < n) {
        //         movePositive=arr[i+valAtPos];
        //         System.out.println("MovePositive position= "+(i+valAtPos));
        //         System.out.println("MovePositive value "+movePositive);
        //    }
        //     if(i-valAtPos >= 0){
        //           moveNegative=arr[i-valAtPos];
        //             System.out.println("MoveNegative position= "+ (i-valAtPos));
        //             System.out.println("MoveNegative value "+moveNegative);

        //     }
           if(i+valAtPos<n){
               if(arr[i+valAtPos]>valAtPos+1){
                   if(ans[i+valAtPos]==0){
                       ans[i+valAtPos]=1;
                   }
               }
            }
            if(i-valAtPos>=0){
               if(arr[i-valAtPos]>valAtPos+1){
                   if(ans[i-valAtPos]==0){
                       ans[i-valAtPos]=1;
                   }
               }
            }
        }
       
        return ans;
    }
}