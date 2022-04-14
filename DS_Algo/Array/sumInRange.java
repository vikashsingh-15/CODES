import java.util.*;
class sumInRange {//not completed
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // int n= sc.nextInt();
       // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        int[] arr = {80, 97, 78, 45, 23, 38, 38, 93, 83, 16, 91, 69, 18, 82, 60, 50, 61, 70, 15, 6, 52, 90 };
        int q=sc.nextInt();
        int b= sc.nextInt();

        System.out.println(solve(arr,q,b));
    }

    static int solve(int[] arr, int a, int b){
        int count=0;
        int sum=0;
        int apoint=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Added no "+arr[i]);
            sum+=arr[i];
            System.out.println("Sum is "+sum);

            if(sum>=a && sum<=b){
                count++;
                System.out.println("Count is "+count);
            }
            if(sum>b){
                while(sum>b && apoint<arr.length){
                    sum=sum-arr[apoint];
                System.out.println("Removed "+arr[apoint]);
                System.out.println("new Sum"+sum);

                    apoint++;
                }
            }
        }
        return count;
    }
}
