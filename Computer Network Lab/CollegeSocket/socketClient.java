package CollegeSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class socketClient {
    public static void main(String[] args) throws Exception{
        String sendMsg="Message Sent By Client";
        int sendMsgLength=sendMsg.getBytes().length;
        DatagramSocket datagramSocket=new DatagramSocket();
        InetAddress inetAddress=InetAddress.getByName("localhost");
        DatagramPacket datagramPacket=new DatagramPacket(sendMsg.getBytes(),sendMsgLength,inetAddress,8088);
        datagramSocket.send(datagramPacket);
        byte[] receBuf=new byte[1024];
        DatagramPacket datagramPacketReceive=new DatagramPacket(receBuf,receBuf.length);
        datagramSocket.receive(datagramPacketReceive);
        String receMsg=new String(receBuf,0,receBuf.length);
        System.out.println(receMsg);
        datagramSocket.close();    
    }
    
}
