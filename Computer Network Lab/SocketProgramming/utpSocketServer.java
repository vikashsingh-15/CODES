import java.io.*;
import java.net.*;
import java.util.*;
public class utpSocketServer {
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket(1889);
    byte data[] = new byte[1024];
    DatagramPacket dp = new DatagramPacket(data, data.length);
    ds.receive(dp);
    String str = new String(dp.getData());
    System.out.print("Value received" + str);
    int num = Integer.parseInt(str.trim());
    int res = num * num;
    byte b[] = String.valueOf(res).getBytes();
    InetAddress IP = InetAddress.getLocalHost();
    DatagramPacket dp1 = new DatagramPacket(b, b.length, IP, dp.getPort());
    ds.send(dp1);
  }
}
