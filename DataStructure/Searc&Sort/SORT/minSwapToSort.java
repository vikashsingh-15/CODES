import java.util.*;
public class minSwapToSort {
   

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = minSwapSort(arr);
        System.out.println(count);
    }

    private static int minSwapSort(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        

        return 0;
    }


    
}
