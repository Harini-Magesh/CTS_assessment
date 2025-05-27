public class Exercise35 {
    public static void main(String[] args) {
        import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket client = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = in.readLine()).equals("exit")) {
            System.out.println("Client: " + line);
            System.out.print("You: ");
            out.println(console.readLine());
        }
        serverSocket.close();
    }
}
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (!(line = console.readLine()).equals("exit")) {
            out.println(line);
            System.out.println("Server: " + in.readLine());
        }
        socket.close();
    }
}

// Exercise 35 code here
    }
}
