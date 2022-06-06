import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class socketServer {
    public static void main(String[] args) throws Exception{
       byte[]bytes = new byte[1024];
         DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            DatagramSocket datagramSocket = new DatagramSocket(8088);
            datagramSocket.receive(datagramPacket);
            String receMsg = new String(bytes,0,bytes.length);
            System.out.println(receMsg);
            String  sendMsg="Message send by Server: ";
            datagramPacket.setData(sendMsg.getBytes());
            datagramPacket.setLength(sendMsg.getBytes().length);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
    }

    
}
