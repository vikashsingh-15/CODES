import java.util.*;

public class oddParity {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    encodeOddParity();
    decodeOddParity();
  }

  static void encodeOddParity() {
    System.out.println("Enter Data To encode");
    String data = scan.next();
    int count = 0;
    for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == '1') {
        count++;
      }
    }
    if (count % 2 != 0) { //even nahi hai mean odd hai so  last me "0" add hoga
      data = data + "0";
    } else {
      data = data + "1";
    }
    System.out.println("Data To Be Sent to USER : " + data);
  }

  static void decodeOddParity() {
    System.out.println("Enter Data To verify");
    String data = scan.next();
    int count = 0;
    for (int i = 0; i < data.length(); i++) {
      if (data.charAt(i) == '1') {
        count++;
      }
    }
    if (count % 2 != 0) {
      System.out.println("No Error");
    } else {
      System.out.println("Error Occured Parity Mismatch");
    }
  }
}
