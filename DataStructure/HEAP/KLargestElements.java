package JAVA.CODES.CODES.InterviewBit.HEAP;
/*K Largest Elements
Easy

52

1

Add to favorites
Asked In:
AMAZON
DELHIVERY
FLIPKART
Problem Description

Given an 1D integer array A of size N you have to find and return the B largest elements of the array A.

NOTE:

Return the largest B elements in any order you like.


Problem Constraints
1 <= N <= 105

1 <= B <= N

1 <= A[i] <= 103



Input Format
First argument is an 1D integer array A

Second argument is an integer B.



Output Format
Return a 1D array of size B denoting the B largest elements.



Example Input
Input 1:

 A = [11, 3, 4]
 B = 2
Input 2:

 A = [11, 3, 4, 6]
 B = 3


Example Output
Output 1:

 [11, 4]
Output 2:

 [4, 6, 11]


Example Explanation
Explanation 1:

 The two largest elements of A are 11 and 4
Explanation 2:

 The three largest elements of A are 11, 4 and 6


Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. */


import java.util.*;


public class KLargestElements {
   
        public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
             PriorityQueue <Integer> pq=new PriorityQueue<>();
             ArrayList <Integer> list=new ArrayList<>();
    
            for(int i=0;i<B;i++){
                pq.add(A.get(i));
               
            }
            for(int i=B;i<A.size();i++){
                if(A.get(i)>pq.peek()){
                    pq.remove();
                    pq.add(A.get(i));
                }
            }
    
            while(pq.size()>0){
                list.add(pq.remove());
            }
    return list;
        }

        public static void main(String[] args) {
            // KLargestElements k=new KLargestElements();
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            ArrayList<Integer> A=new ArrayList<>();
            for(int i=0;i<n;i++){
                A.add(sc.nextInt());
            }
            int B=sc.nextInt();

            ArrayList<Integer> ans=solve(A,B);
            for(int i=0;i<ans.size();i++){
                System.out.print(ans.get(i)+" ");
            }
       
    
    
    
}
}
