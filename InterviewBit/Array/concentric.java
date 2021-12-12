/*PRETTYPRINT
Easy

43

10

Add to favorites
Print concentric rectangular pattern in a 2d matrix. 

Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.

Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.

Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.*/ 

import java.util.*;
public class concentric {
    public static int[][] prettyPrint(int n) {
           int arraySize = n * 2 - 1;
        int[][] result = new int[arraySize][arraySize];
         
        //Fill the values
        for(int i = 0; i < arraySize; i++)
        {
            for(int j = 0; j < arraySize; j++)
            {
                result[i][j] = Math.max(Math.abs(i-arraySize/2),
                                    Math.abs(j-arraySize/2))+1;
            }
        }
        return result;// here we can print result too
         
}   
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] sol=prettyPrint(n);
    for(int i=0;i<sol.length;i++)
    {
        for(int j=0;j<sol[0].length;j++)
        {
            System.out.print(sol[i][j]+" ");
        }
        System.out.println();
    }
 }
}