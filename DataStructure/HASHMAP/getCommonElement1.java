import java.io.*;
import java.util.*;

public class getCommonElement1{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr[]=new int[n];
    int brr[]=new int[m];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++){
        brr[i]=sc.nextInt();
    }

    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<n;i++){
        hs.add(arr[i]);
    }
    for(int i=0;i<m;i++){
        if(hs.contains(brr[i])){
            System.out.println(brr[i]);
        }
    }
 }

}