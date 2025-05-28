import java.io.*;
import java.net.*;

public class Server35 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from server");
        System.out.println("Client: " + in.readLine());
        server.close();
    }
}
