import java.util.*;

class leadersInArray {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // leaders(arr,n);
        System.out.println(leaders(arr, n));

    }

    static ArrayList<Integer> leaders(int arr[], int n) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        // arrlist.add(arr[arr.length-1]);
        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                arrlist.add(arr[i]);
                max = arr[i];

            }

            
        }
        return arrlist.reverse();
    }
}
