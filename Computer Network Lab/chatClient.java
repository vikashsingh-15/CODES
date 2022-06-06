import java.util.*;
import java.io.*;
import java.net.*;
public class chatClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 3033);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = socket.getOutputStream();
        PrintWriter pwriter = new PrintWriter(out, true);
        InputStream istream = new DataInputStream(socket.getInputStream());
        BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
        System.out.println("Enter Data To Be Sent to Server: ");
        String receiveMessage, sendMessage;
        while (true) {
            if ((receiveMessage = receiveRead.readLine()) != null) {
                System.out.println("Received: " + receiveMessage);
            }
            sendMessage = in.readLine();
            pwriter.println(sendMessage);
            pwriter.flush();
        }
    }
    
}
