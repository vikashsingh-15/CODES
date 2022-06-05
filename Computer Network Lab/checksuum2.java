import java.util.*;
public class checksuum2 {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
    checksumEncoder(); // sender side
    checksumDecoder(); // receiver side
  }

  static void checksumEncoder() {
    String sum = "";
    String ans = "";
    StringBuilder sb = new StringBuilder();
    System.out.println("Enter Data to be encoded: ");
    String data = scan.next();

    System.out.println("Enter Block Size: ");
    int blockSize = scan.nextInt();
    int noOfBitsToAdd = data.length() % blockSize;
    if (noOfBitsToAdd != 0) {
      for (int i = 0; i < noOfBitsToAdd; i++) {
        data += "0";
      }
    }

    String arr[] = new String[blockSize];
    int numberOfBits = data.length() / blockSize;
    for (int i = 0; i < blockSize; i++) {
      String temp = data.substring(i * numberOfBits, (i + 1) * numberOfBits);
      arr[i] = temp;
    }

    for (int i = 0; i < blockSize; i++) {
      String num1 = arr[i];
      String num2 = sum;
      sum = binaryAdd(num1, num2);
    }

    for (int i = 0; i < sum.length(); i++) {//1 s complement
      if (sum.charAt(i) == '1') {
        ans = ans + "0";
      } else {
        ans = ans + "1";
      }
    }
    System.out.println("Checksum: " + ans);
    sb.append(ans);
    sb.append(data);
    System.out.println("Data To Be Sent to USER : " + sb.toString());
  }

  static void checksumDecoder() {
    String sum = "";
    int ans = 1;
    System.out.println("Enter Data To verify");
    String data = scan.next();

    System.out.println("Enter Block Size: ");
    int blockSize = scan.nextInt();
    int noOfBitsToAdd = data.length() % blockSize;
    if (noOfBitsToAdd != 0) {
      for (int i = 0; i < noOfBitsToAdd; i++) {
        data += "0";
      }
    }

    String arr[] = new String[blockSize];
    int numberOfBits = data.length() / blockSize;
    for (int i = 0; i < blockSize; i++) {
      String temp = data.substring(i * numberOfBits, (i + 1) * numberOfBits);
      arr[i] = temp;
    }

    for (int i = 0; i < blockSize; i++) {
      String num1 = arr[i];
      String num2 = sum;
      sum = binaryAdd(num1, num2);
    }
   
    for (int i = 0; i < sum.length(); i++) {
      int x = sum.charAt(i) - '0';
      ans = ans * x;
    }

    if (ans == 1) {
      System.out.println("No Error");
    } else {
      System.out.println("Error Occured");
    }
  }

  static String binaryAdd(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    String ans = "";
    int carry = 0;
    int len1 = num1.length() - 1;
    int len2 = num2.length() - 1;
    while (len1 >= 0 || len2 >= 0) {
      int sum = carry;
      if (len1 >= 0) sum += num1.charAt(len1) - '0';
      if (len2 >= 0) sum += num2.charAt(len2) - '0';
      sb.append(sum % 2); //append put things at end thus we have to reverse it
      carry = sum / 2;
      len1--;
      len2--;
    }
    ans = sb.reverse().toString();
    // System.out.println("ans: " + ans);

    if (carry == 0) {
      return ans;
    } else {
      return binaryAdd(ans, "1");
    }
  }
}
