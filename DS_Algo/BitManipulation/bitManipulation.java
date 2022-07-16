import java.util.*;
import java.math.BigInteger;

public class bitManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        // rightMostBit(x);
        // leftMostBit(x);
        // countSetBits(x);
        // reverseBits(x);
        // flipBits(x);
        tailingZeros(x);
    }

    private static void rightMostBit(int x) {
        System.out.println(Integer.toBinaryString(x));

        int rightMostBit = x & -x;// returns the binary number containing the rightmost set bit as 1.
        System.out.println("Right most bit is: " + rightMostBit);

        // way2:
        int rightMostBit2 = (int) ((Math.log10(x & -x)) / Math.log10(2)) + 1;

        System.out.println("Right most bit is: " + rightMostBit2);// return rightmost set bit position

        // Way3
        int position = 0;
        int m = 1;
        while ((x & m) == 0) {
            m = m >> 1;
            position++;
        }
        System.out.println("Right most bit is: " + position);
    }

    private static void leftMostBit(int x) {
        System.out.println(Integer.toBinaryString(x));
        // way 1
        int pos = 0;
        while (x > 0) {
            x = x >> 1;
            pos++;
        }
        System.out.println("left most bit is in position: " + pos);// Indexing from 1

        // way 2

        int binary = 1 << (pos - 1);
        System.out.println("left most bit is: " + Integer.toBinaryString(binary));
    }

    private static void countSetBits(int x) {
        int x1 = x;
        int x2 = x1;
        int x3 = x2;
        System.out.println(Integer.toBinaryString(x));
        // way 1
        int count = 0;
        while (x > 0) {
            count += x & 1;// agar x ka 1st position 1 hoga to & 1 dega and count increment krna hoga,else
                           // & 0 dega.
            x = x >> 1;
        }
        System.out.println("Number of set bits: " + count);

        // way 2
        int count2 = 0;
        while (x1 > 0) {
            x1 = x1 & (x1 - 1);
            count2++;
        }
        System.out.println("Number of set bits: " + count2);

        // way 3
        int count3 = 0;
        while (x2 != 0) {
            int rmsb = x2 & -x2;
            x2 = x2 - rmsb;
            count3++;
        }
        System.out.println("Number of set bits: " + count3);

        // way 4 This will give number of total bits 0 and 1 combined.
        int countOne = (int) (Math.log(x3) / Math.log(2)) + 1;
        System.out.println("Number of set bits: " + countOne);
    }

    private static void reverseBits(int x) {
        int x1 = x;
        int x2 = x1;
        int x3 = x2;
        int x4 = x3;
        int x5 = x4;
        int x6 = x5;
        int x7 = x6;
        System.out.println(Integer.toBinaryString(x));

        // way 1
        int reverse = 0;
        while (x > 0) {
            reverse = (reverse << 1) | (x & 1);
            x = x >> 1;
        }
        System.out.println("1 Reverse of the number: " + Integer.toBinaryString(reverse));

        // way 2
        StringBuilder sb = new StringBuilder();
        while (x2 != 0) {
            int last = x2 & 1;
            sb.append(last);
            x2 = x2 >> 1;
        }
        System.out.println("2 Reverse of the number: " + sb.toString());

        // way 3 Only when no is in 32 bit or if bit is mentioned in reverse
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            // result += (x3 & 1) << (31 - i);
            // x3 >>= 1;
            ans = ans << 1;
            ans += x3 & 1;
            x3 = x3 >> 1;
        }
        System.out.println("3 Reverse of the number: " + ans);

        // way 4
        int reverse4 = Integer.reverse(x4);
        System.out.println("4 Reverse of the number: " + reverse4);

        // // way 5

        // StringBuilder bin = new StringBuilder(Integer.toBinaryString(x5));
        // while (bin.length() < 32)
        // bin.insert(0, "0");
        // int reverse5 = Integer.parseInt(bin.reverse().toString(), 2);
        // System.out.println("5 Reverse of the number: " + reverse5);

        // way 6
        int reverse6 = Integer.parseInt(new StringBuilder(Integer.toBinaryString(x6)).reverse().toString(), 2);
        System.out.println("6 Reverse of the number: " + Integer.toBinaryString(reverse6));
        System.out.println("6 Reverse of the number: " + reverse6);

        // way 7
        int rev_input = 0;
        while (x7 > 0) {
            rev_input <<= 1;
            if ((x7 & 1) != 0) {
                rev_input ^= 1;
            }
            x7 >>= 1;
        }
        System.out.println("7 Reverse of the number: " + Integer.toBinaryString(rev_input));
        System.out.println("7 Reverse of the number: " + rev_input);
    }

    public static void flipBits(int x) {
        System.out.println(Integer.toBinaryString(x));
        int x1 = x;
        int x2 = x1;
        int x3 = x2;
        int x4 = x3;
        int x5 = x4;

        // Way 1
        int flip1 = 1;
        while (flip1 <= x) {
            flip1 <<= 1;
        }
        flip1--;
        int flip1_ans = x ^ flip1;
        System.out.println("1 Flip Bits " + Integer.toBinaryString(flip1_ans));

        // // Way 2 good for 32 bit numbers as it convert 0's before no also
        // x1 ^= -1;
        // System.out.println("2 Flip Bits " + Integer.toBinaryString(x1));
        // System.out.println("2 Flip Bits " + x1);

        // // Way 3 good for 32 bit numbers as it convert 0's before no also
        // x2 = ~x2;
        // System.out.println("3 Flip Bits " + Integer.toBinaryString(x2));
        // System.out.println("3 Flip Bits " + x2);

        // Way 4
        // Calculate number of bits of N-1; it is equal to log (base 2)(n)
        int bits = (int) (Math.log(x3) / Math.log(2));
        int m = 1 << bits;//generate a number with X bits and all bits set. That is, 11111….X-times. This can be done by calculating:
        m = m | m - 1;
        x3 = x3 ^ m;
        System.out.println("4 Flip Bits " + Integer.toBinaryString(x3));
        System.out.println("4 Flip Bits " + x3);


    }

    public static void tailingZeros(int x) {
        System.out.println(Integer.toBinaryString(x));
        int x1 = x;
        int x2 = x1;
        int x3 = x2;
        int x4 = x3;

        // Way 1

        int count1 = 0;
        while (x1 % 2 == 0) {
            count1++;
            x1 /= 2;
        }
        System.out.println("1 Tailing Zeros " + count1);

        // way 2
        int count2 = 0;
        while ((x2 & 1) == 0){
            x2 = x2 >> 1;
            count2++;
        }
        System.out.println("2 Tailing Zeros " + count2);

        // way 3
        int rightMostBit2 = (int) ((Math.log(x & -x)) / Math.log(2)) + 1;
        System.out.println("3 Tailing Zeros " + (rightMostBit2-1));
        
    }

}

// Explaination of way 4 -----Reverse;

// First step is that we set the result to zero, then each iteration we shift
// the result to the left and we get the rightmost bit from n. After that, we
// shift the result to the right.
// For example,
// n = 13
// represented in binary is:
// n = 00000000000000000000000000001101
// when i == 0,
// n&1 = 00000000000000000000000000000001
// ans += 1
// after n >> 1, n = 0000000000000000000000000000110

// when i == 1,
// ans = 00000000000000000000000000000010
// n & 1 = 0000000000000000000000000000000 = 0
// ans += 0;
// after n >> 1, n = 0000000000000000000000000000011

// when i == 2,
// ans = 00000000000000000000000000000100
// n & 1 = 00000000000000000000000000000001
// ans + 1 = 00000000000000000000000000000101
// after n >> 1, n = 0000000000000000000000000000001

// when i = 3,
// ans = 00000000000000000000000000001010
// n & 1 = 00000000000000000000000000000001
// ans + 1 = 00000000000000000000000000001011
// after n >> 1, n = 0000000000000000000000000000000 = 0

// From now on n equals to zero, so (n & 1) will always be zero, therefore the
// ans will only be shifted left till the end of the for loop.
// In the end,
// ans = 10110000000000000000000000000000
// all the bits in n are shifted.