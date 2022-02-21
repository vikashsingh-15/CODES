import java.util.*;

class sortSearch {

    static int[] arr = new int[10];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to be searched");
        int x = sc.nextInt();
        System.out.println("After Sorting " + Arrays.toString(arr));
        arrange(arr, arr.length);
        System.out.println("After Sorting " + Arrays.toString(arr));
        Search(arr, x, 0, 9);
        System.out.println(Arrays.toString(arr));

    }

    static void arrange(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    static void Search(int[] arr, int x, int low, int high) {
        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            System.out.println("Element found at index " + mid);
        } else if (arr[mid] > x) {
            Search(arr, x, low, mid - 1);
        } else {
            Search(arr, x, mid + 1, high);
        }

    }

}
