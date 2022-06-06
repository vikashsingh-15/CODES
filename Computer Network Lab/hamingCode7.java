import java.util.*;

public class hamingCode7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        encode();
        decode();
    }

    static void encode() {
 // Input way 1
        // System.out.println("Enter the message: ");
        // String message = sc.nextLine();
        // int arr[] = new int[11];
        // int k = 0;
        // for (int i = 0; i < 11; i++) {
        // if (i == 0 || i == 1 || i == 4 || i == 7) {
        // continue;
        // } else {
        // arr[i] = message.charAt(k) - '0';
        // k++;
        // }
        // }

// Inpput way 2
        System.out.println("Enter the message Bit One by One");
        int arr[] = new int[11];
        for (int i = 0; i < 11; i++) {
            if (i == 0 || i == 1 || i == 4 || i == 7) {
                continue;
            } else {
                arr[i] = sc.nextInt();
            }
        }
        arr[0] = arr[2] ^ arr[4] ^ arr[6] ^ arr[8] ^ arr[10];
        arr[1] = arr[2] ^ arr[5] ^ arr[6] ^ arr[9] ^ arr[10];
        arr[3] = arr[4] ^ arr[5] ^ arr[6];
        arr[7] = arr[8] ^ arr[9] ^ arr[10];
        for (int i = 0; i < 11; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    static void decode() {
        System.out.println("Enter the message: ");
        String message = sc.next();
        int arr[] = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            arr[i] = message.charAt(i) - '0';
        }
        if (arr[0] != (arr[2] ^ arr[4] ^ arr[6] ^ arr[8] ^ arr[10])) {
            System.out.println("Error in first bit");
            return;
        }
        if (arr[1] != (arr[2] ^ arr[5] ^ arr[6] ^ arr[9] ^ arr[10])) {
            System.out.println("Error in second bit");
            return;
        }
        if (arr[3] != (arr[4] ^ arr[5] ^ arr[6])) {
            System.out.println("Error in third bit");
            return;
        }
        if (arr[7] != (arr[8] ^ arr[9] ^ arr[10])) {
            System.out.println("Error in fourth bit");
            return;
        }

        System.out.println("NO Error Occured");

    }

}