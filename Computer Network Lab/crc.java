import java.util.*;

public class crc {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        crcEncoder();
        crcDecoder();// receiver side

    }

    static void crcEncoder() {
        // user input
        int size;
        System.out.println("Enter the size of the data array: ");
        size = scan.nextInt();
        int oldData[] = new int[size];
        System.out.println("Enter data bits in the array one by one: ");
        for (int i = 0; i < size; i++) {
            oldData[i] = scan.nextInt();
        }

        System.out.println("Enter the size of the divisor array:");
        size = scan.nextInt();
        int divisor[] = new int[size];
        System.out.println("Enter divisor bits in the divisor array one by one: ");
        for (int i = 0; i < size; i++) {
            divisor[i] = scan.nextInt();
        }

        // actual code start
        int data[] = new int[oldData.length + divisor.length - 1];
        for (int i = 0; i < oldData.length; i++) {
            data[i] = oldData[i];
        }
        for (int i = oldData.length; i < data.length; i++) {
            data[i] = 0;
        }
        for (int i = 0; i < oldData.length; i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] = data[i + j] ^ divisor[j];
                }
            }
        }

        System.out.println("Check Sum Code is ");
        for (int i = 0; i < oldData.length; i++) {
            data[i] = oldData[i];
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
        System.out.println();//so that while taking decoder input it doesn't get confused
    }


    static void crcDecoder() {
        // user input
        int size;
        System.out.println("Enter the size of the data array: ");
        size = scan.nextInt();
        int oldData[] = new int[size];
        System.out.println("Enter data bits in the array one by one: ");
        for (int i = 0; i < size; i++) {
            oldData[i] = scan.nextInt();
        }
        System.out.println("Enter the size of the divisor array:");
        size = scan.nextInt();
        int divisor[] = new int[size];
        System.out.println("Enter divisor bits in the divisor array one by one: ");
        for (int i = 0; i < size; i++) {
            divisor[i] = scan.nextInt();
        }
        //actual code start
        int data[] = new int[oldData.length + divisor.length - 1];
        for (int i = 0; i < oldData.length; i++) {
            data[i] = oldData[i];
        }
        for (int i = oldData.length; i < data.length; i++) {
            data[i] = 0;
        }
        for (int i = 0; i < oldData.length; i++) {
            if (data[i] == 1) {
                for (int j = 0; j < divisor.length; j++) {
                    data[i + j] = data[i + j] ^ divisor[j];
                }
            }
        }  
    int sum=0;
        for (int i = 0; i < data.length; i++) {
         sum=sum+data[i];
        }
        if(sum==0){
            System.out.println("Data is correct");
        }
        else{
            System.out.println("Data is incorrect");
        }
    }
}
