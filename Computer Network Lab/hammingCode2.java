import java.util.*;

public class hammingCode2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        encode();
        decode();
    }

    static void encode() {
        System.out.println("Enter the message to be encoded");
        String message = sc.nextLine();
        int redBits = 0;
        while (Math.pow(2, redBits) < message.length() + redBits + 1) {
            redBits++;
        }
        int totalBits = message.length() + redBits;
        int arr[] = new int[totalBits];
        int k = 0;

        for (int i = arr.length - 1, p = 0; i >= 0; i--) {
            if (p == 0 || p == 1 || p == 3 || p == 7
                    || p == 15 || p == 31 || p == 63) {
                arr[i] = -1;
            } else {
                arr[i] = message.charAt(k) - '0';
                k++;
            }
            p++;
        }
        int arr2[] = reverseArray(arr);
        for (int i = 0; i < arr2.length; i++) {
            int sum = 0;
            if (i == 0) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 2 || j == 4 || j == 6 || j == 8 || j == 10 || j == 12 || j == 14 || j == 16)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    arr2[i] = 0;
                } else {
                    arr2[i] = 1;
                }
            }
            if (i == 1) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 2 || j == 5 || j == 6 || j == 9 || j == 10 || j == 13 || j == 14)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    arr2[i] = 0;
                } else {
                    arr2[i] = 1;
                }
            }
            if (i == 3) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 4 || j == 5 || j == 6 || j == 11 || j == 12 || j == 13 || j == 14)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    arr2[i] = 0;
                } else {
                    arr2[i] = 1;
                }
            }
            if (i == 7) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 8 || j == 9 || j == 10 || j == 11 || j == 12 || j == 13 || j == 14 || j == 23)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    arr2[i] = 0;
                } else {
                    arr2[i] = 1;
                }
            }
            if (i == 15) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 16 || j == 17 || j == 18 || j == 19 || j == 20 || j == 21 || j == 22)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    arr2[i] = 0;
                } else {
                    arr2[i] = 1;
                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }
        System.out.println();
    }

    static void decode() {

        System.out.println("Enter the message to be DECODED");
        String message = sc.nextLine();
        int arr2[]=new int [message.length()];

        for(int i=0;i<message.length();i++) {
            arr2[i]=message.charAt(i)-'0';
        }


        boolean error = false;
        for (int i = 0; i < arr2.length; i++) {
            int sum = 0;
            if (i == 0) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 2 || j == 4 || j == 6 || j == 8 || j == 10 || j == 12 || j == 14 || j == 16)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    if (arr2[i] != 0) {
                        error = true;
                    }
                } else {
                    if (arr2[i] != 1) {
                        error = true;
                    }
                }
            }
            if (i == 1) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 2 || j == 5 || j == 6 || j == 9 || j == 10 || j == 13 || j == 14)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    if (arr2[i] != 0) {
                        error = true;
                    }
                } else {
                    if (arr2[i] != 1) {
                        error = true;
                    }
                }
            }
            if (i == 3) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 4 || j == 5 || j == 6 || j == 11 || j == 12 || j == 13 || j == 14)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    if (arr2[i] != 0) {
                        error = true;
                    }
                } else {
                    if (arr2[i] != 1) {
                        error = true;
                    }
                }
            }
            if (i == 7) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 8 || j == 9 || j == 10 || j == 11 || j == 12 || j == 13 || j == 14 || j == 23)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    if (arr2[i] != 0) {
                        error = true;
                    }
                } else {
                    if (arr2[i] != 1) {
                        error = true;
                    }
                }
            }
            if (i == 15) {
                for (int j = 2; j < arr2.length; j++) {
                    if (j == 16 || j == 17 || j == 18 || j == 19 || j == 20 || j == 21 || j == 22)
                        sum = sum + arr2[j];
                }
                if (sum % 2 == 0) {
                    if (arr2[i] != 0) {
                        error = true;
                    }
                } else {
                    if (arr2[i] != 1) {
                        error = true;
                    }
                }
            }
        }

        if (error) {
            System.out.println("Error Occured");
        } else {
            System.out.println("No Error Occured ");
           
        }

    }

    static int[] reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        return arr2;
    }

}
