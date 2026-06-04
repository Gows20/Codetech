import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        try {

            // Connect to Server
            Socket socket = new Socket("localhost", 5000);

            // Send Message
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello from Client!");

            System.out.println("Message Sent to Server");

            // Close
            output.close();
            socket.close();

        }

        catch (Exception e) {

            System.out.println("Error occurred");

            e.printStackTrace();

        }
    }
}
