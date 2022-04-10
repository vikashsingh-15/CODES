package JAVA.CODES.CODES.DataStructure.HASHMAP;

/*Get Common Elements - 2
Easy  Prev   Next
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. You are required to find the intersection of a1 and a2. To get an idea check the example below:
 
if a1 -> 1 1 2 2 2 3 5
and a2 -> 1 1 1 2 2 4 5
intersection is -> 1 1 2 2 5

Note -> Don't assume the arrays to be sorted. Check out the question video.
Input Format
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output Format
All relevant elements of intersection in separate lines
The elements of intersection should be printed in order of their occurence in a2.
 */
    
import java.io.*;
import java.util.*;
public class getCommonElement2 {
public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int m=sc.nextInt();
    int brr[]=new int[m];
    for(int i=0;i<m;i++){
        brr[i]=sc.nextInt();
    }

    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    for(int i=0;i<n;i++){
     if(map.containsKey(arr[i])){
        int of=map.get(arr[i]);
        int nf=of+1;
        map.put(arr[i],nf);
     }
     else{
         map.put(arr[i],1);
     }
    }
    System.out.println("Map");
    for(int i=0;i<m;i++){
        if(map.containsKey(brr[i])&& map.get(brr[i])>0){
            System.out.println(brr[i]);
            int of=map.get(brr[i]);
        int nf=of-1;
        map.put(brr[i],nf);

        }
    }
 }


    
}
