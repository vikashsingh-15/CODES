package JAVA.CODES.CODES.DataStructure.HEAP;

import java.io.*;
import java.util.*;

public class KLargestElement {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      Arrays.sort(arr);
      System.out.println("Largest Element");
      for(int i=n-k;i<n;i++){
        System.out.println(arr[i]);
    }
    }

}
