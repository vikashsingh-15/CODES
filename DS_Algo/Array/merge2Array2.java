import java.util.*;

class merge2Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        merge2(a, b);
    }

    public static void merge2(int[] a, int[] b) {

        int start = 0;
        int end = a.length - 1;
        int count = 0;
        while (count<a.length && count<b.length) {
            if (a[end] > b[start]) {
                int temp = a[end];
                a[end] = b[start];
                b[start] = temp;
            }
            start++;
            end--;
            count++;
        }
        Arrays.sort(a);
        Arrays.sort(b);

       


// Way 2nd approach
            // int count = 0;
            // int apoint = 0;
            // int bpoint = 0;
            // while(a.length>b.length ? count < a.length:count < b.length) {
            //     count++;
            //     if(a[apoint]>=b[bpoint]) {
            //         int temp = a[apoint];
            //         a[apoint] = b[bpoint];
            //         b[bpoint] = temp;
            //         apoint++;
            //     } 
            //     else{
            //         bpoint++;
            //         apoint++;
            //     }
                // else {
                //     bpoint++;
                //     apoint++;  
                // }
            




     for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
