// package JAVA.CODES.CODES.InterviewBit.Array;

/*Minimum Lights to Activate
Easy

243

16

Add to favorites
Asked In:
DIRECTI
Problem Description

There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.

All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].

Initially all lights are off.

Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.



Problem Constraints
1 <= N <= 1000

1 <= B <= 1000



Input Format
First argument is an integer array A where A[i] is either 0 or 1.

Second argument is an integer B.



Output Format
Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.


Example Input
Input 1:

A = [ 0, 0, 1, 1, 1, 0, 0, 1].
B = 3
Input 2:

A = [ 0, 0, 0, 1, 0].
B = 3


Example Output
Output 1:

2
Output 2:

-1


Example Explanation
Explanation 1:

In the first configuration, Turn on the lights at 3rd and 8th index.
Light at 3rd index covers from [ 1, 5] and light at 8th index covers [ 6, 8].
Explanation 2:

In the second configuration, there is no light which can light the first corridor.


Note:You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details. */
import java.util.*;

public class MinimumLightsToActivate3 {
    public static int solve(int[] Arr, int B) {

        int count = 0;
        int left = 0, right = 0, i = 0;
        int n = Arr.length;

        while (i < n) {
            right = Math.min(i + B - 1, n - 1);
            left = Math.max(i - B + 1, 0);
            boolean bulbfound = false;
            while (right >= left) {
                if (Arr[right] == 1) {
                    bulbfound = true;
                    count++;
                    break;
                }
                right--;
            }
            if (bulbfound == false) {
                return -1;
            }

            i = right + B;

        }

        //

        return count;
    }

    public static void main(String[] args) throws Exception

    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Arr[] = new int[n];

        // int[] Arr= new int [] {
        // -533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961-509,-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
        // int[] Brr= new int [] {
        // -533,-666,-500,169,724,478,358,-38,-536,705,-855,281,-173,961-509,-5,942,-173,436,-609,-396,902,-847,-708,-618,421,-284,718,895,447,726,-229,538,869,912,667,-701,35,894,-297,811,322,-667,673,-336,141,711,-747,-132,547,644,-338,-243,-963,-141,-277,741,529,-222,-684,35};
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        int C = sc.nextInt();

        int sol = solve(Arr, C);

        System.out.println(sol);
    }

}
