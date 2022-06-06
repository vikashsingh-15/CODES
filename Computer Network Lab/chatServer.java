import java.io.*;
import java.net.*;

public class chatServer {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(3033);
    Socket socket = serverSocket.accept();
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    OutputStream out = socket.getOutputStream();
    PrintWriter pwriter = new PrintWriter(out, true);
    InputStream istream = new DataInputStream(socket.getInputStream());
    BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
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
