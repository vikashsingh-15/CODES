import java.util.*;

public class quicksort {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        qsort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void qsort(int arr[], int low, int high) {
        int p = partition(arr, low, high);

        if (low < p - 1) {
            // System.out.println("p is at this time = "+p);
            // System.out.println("low is at this time = "+low);
            qsort(arr, low, p - 1);
        }
        if (p < high) {
            // System.out.println("p is at this time = "+p);
            // System.out.println("high is at this time = "+high);

            qsort(arr, p, high);

        }
    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[((low + high) / 2)];
        while (low <= high) {

            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }

            if (low <= high) {

                // System.out.println("Values before swap");
                // System.out.println("Low is = "+arr[low]);
                // System.out.println("high is = "+arr[high]);
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                // System.out.println("Values after swap");
                // System.out.println("Low is = "+arr[low]);
                // System.out.println("high is = "+arr[high]);
                low++;
                high--;
            }
        }
        return low;
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i <= arr.length - 1; i++) {


            System.out.println("--------------------------Sorted array----------------------");
            System.out.println(arr[i]);
        }
    }

}
