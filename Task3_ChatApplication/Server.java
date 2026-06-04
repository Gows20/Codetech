import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {

            // Create Server Socket
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Server Started...");
            System.out.println("Waiting for client...");

            // Accept Client
            Socket socket = serverSocket.accept();

            System.out.println("Client Connected!");

            // Read Message
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String message = input.readLine();

            System.out.println("Client Message: " + message);

            // Close
            input.close();
            socket.close();
            serverSocket.close();

        }

        catch (Exception e) {

            System.out.println("Error occurred");

            e.printStackTrace();

        }
    }
}