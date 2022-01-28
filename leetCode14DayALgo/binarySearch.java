import java.util.*;

class binarySearch {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("No to search");
        int x = sc.nextInt();
        // System.out.println(search1(arr, 0, n - 1,x));
        // System.out.println(search2(arr, 0, n - 1, x));
        System.out.println(search3(arr, x));

    }

    static boolean search1(int[] arr, int low, int high, int x) {// itterative

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                System.out.println("Found at " + mid);
                return true;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    static boolean search2(int[] arr, int low, int high, int x) {// recursive

        int mid = low + high;
        if (low <= high) {

            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                return search2(arr, mid + 1, high, x);
            } else {
                return search2(arr, low, mid - 1, x);
            }
        }
        return false;
    }

    static boolean search3(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        // int mid=(low + high)/2;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                System.out.println("Found at " + mid);
                return true;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }

}
