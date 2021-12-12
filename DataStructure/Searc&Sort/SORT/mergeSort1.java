import java.util.*;
public class mergeSort1 {


public static int[] mergeSort(int[] a, int low, int high) {

    if(low == high) {
        int[] b = new int[1];
        b[0] = a[low];
        return b;
    }

    int mid=(low+high)/2;
   
        int [] firstSortedHalf=mergeSort(a,low,mid);
        int [] secondSortedHalf=mergeSort(a,mid+1,high);
        int [] sortedArray=mergeTwoSortedArray(firstSortedHalf,secondSortedHalf);
        return sortedArray;
}

    public static int[] mergeTwoSortedArray(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else { // b[j]<a[i]
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        return c;

        // int[] c = new int[a.length + b.length];
        // int i = 0, j = 0, k = 0;
        // while (i < a.length && j < b.length) {
        // if (a[i] < b[j]) {
        // c[k++] = a[i++];
        // } else {
        // c[k++] = b[j++];
        // }
        // }
        // while (i < a.length) {
        // c[k++] = a[i++];
        // }
        // while (j < b.length) {
        // c[k++] = b[j++];
        // }
        // return c;
    }



    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] sa = mergeSort(a, 0, n-1);

        for (int i = 0; i < sa.length; i++) {
            System.out.print(sa[i] + " ");
        }
}
}
