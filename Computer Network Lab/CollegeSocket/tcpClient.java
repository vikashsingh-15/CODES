package CollegeSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class tcpClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8888);
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        System.out.println(new String(buf, 0, len));
        out.write("hello server".getBytes());
        socket.close();
        
    }    
}
