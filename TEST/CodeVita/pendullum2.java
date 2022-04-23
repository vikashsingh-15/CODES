import java.util.*;
public class pendullum2 {
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
        int check=0;
         check=sumToK(arr, pos);
        if(check>0){
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }
    }

 public static int sumToK(int[] a, int target) {
  int n = a.length;
  HashMap < Integer, Integer > hashMap = new HashMap < > ();
  int count = 0, sum = 0;
  for (int i = 0; i < n; i++) {
    sum += a[i];
    if (sum == target) {
      count++;
    }
    if (hashMap.get(sum - target) != null) {
      count += hashMap.get(sum - target);
    }
    if (hashMap.get(sum) != null) {
      hashMap.put(sum, hashMap.get(sum) + 1);
    } else {
      hashMap.put(sum, 1);
    }
  }
  return count;
}
    
}
