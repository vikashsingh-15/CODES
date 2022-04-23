import java.util.*;
public class pendulum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int pos=Character.getNumericValue(str.charAt(0));
        int check=-1;
        int sum=0;
        for(int i = 0; i < n; i++) {
             if(sum==pos){
                check=1;
             }
             else if(sum>pos){
               sum=sum-arr[i];
             }
             else if(sum<pos){
               sum=sum+arr[i];
             }
        }
        if(check==1){
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }   
    }
    
    
}
