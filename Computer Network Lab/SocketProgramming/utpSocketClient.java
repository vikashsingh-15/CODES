import java.io.*;
import java.net.*;
import java.util.*;

public class utpSocketClient {

  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket();
    Scanner sc = new Scanner(System.in);
    System.out.print("Which integer will you like to give:");
    int i = sc.nextInt();
    byte b[] = String.valueOf(i).getBytes();
    InetAddress IP = InetAddress.getLocalHost();
    DatagramPacket dp = new DatagramPacket(b, b.length, IP, 1889);
    ds.send(dp);
    byte data[] = new byte[1024];
    DatagramPacket dp1 = new DatagramPacket(data, data.length);
    ds.receive(dp1);
    String str = new String(dp1.getData());
    System.out.println("Number: " + str);
  }
}
