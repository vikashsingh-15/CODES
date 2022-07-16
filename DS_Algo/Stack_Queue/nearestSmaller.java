import java.util.*;

public class nearestSmaller {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        smallerLeft(arr);
        smallerRight(arr);
    }

    public static void smallerLeft(int[] arr) {
        int solLeft[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            while (stk.size() > 0 && stk.peek() >= arr[i]) {
                stk.pop();
            }
            if (stk.size() == 0) {
                solLeft[i] = -1;
            } else {
                solLeft[i] = stk.peek();
            }
            stk.push(arr[i]);
        }

        for (int i = 0; i < solLeft.length; i++) {
            System.out.print(solLeft[i] + " ");
        }

        System.out.println();
    }

    public static void smallerRight(int[] arr) {
        int solRight[] = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[arr.length - 1]);
        for (int i = arr.length - 1; i >= 0; i--) {
            while (stk.size() > 0 && stk.peek() >= arr[i]) {
                stk.pop();
            }
            if (stk.size() == 0) {
                solRight[i] = -1;
            } else {
                solRight[i] = stk.peek();
            }
            stk.push(arr[i]);
        }

        for (int i = 0; i < solRight.length; i++) {
            System.out.print(solRight[i] + " ");
        }
    }

}
