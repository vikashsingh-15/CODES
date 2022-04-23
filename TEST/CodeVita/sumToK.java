import java.util.*;
public class sumToK {
    public static int countSubarraysWithSumK(int[] a, int K) {
        int n = a.length;
        HashMap < Integer, Integer > hash = new HashMap < > ();
        int count = 0, sum = 0;
        for (int i = 0; i < n; i++) {
          sum += a[i];
          if (sum == K) {
            count++;
          }
          if (hash.get(sum - K) != null) {
            count += hash.get(sum - K);
          }
          if (hash.get(sum) != null) {
            hash.put(sum, hash.get(sum) + 1);
          } else {
            hash.put(sum, 1);
          }
        }
        return count;
      }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(countSubarraysWithSumK(arr, K));
    }
}

    
