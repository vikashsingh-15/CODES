import java.util.*;

public class evenParity {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    encodeEvenParity();
    decodeEvenParity();
  }

  static void encodeEvenParity() {
    System.out.println("Enter Data To encode");
    String data = scan.next();
    int size = data.length();
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (data.charAt(i) == '1') {
        count++;
      }
    }
    if (count % 2 != 0) {
      data = data + "1";
    } else {
      data = data + "0";
    }
    System.out.println("Data To Be Sent to USER : " + data);
  }

  static void decodeEvenParity() {
    System.out.println("Enter Data To verify");
    String data = scan.next();
    int size = data.length();
    int count = 0;
    for (int i = 0; i < size; i++) {
      if (data.charAt(i) == '1') {
        count++;
      }
    }
    if (count % 2 != 0) {
      System.out.println("Error Occured Parity Mismatch");
    } else {
      System.out.println("No Error");
    }
  }
}
