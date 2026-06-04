import java.io.*;

public class FileHandling {

    public static void main(String[] args) {

        try {

            // CREATE FILE AND WRITE
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello Student\n");
            writer.write("Welcome to CODTECH Internship\n");
            writer.write("This is File Handling Task\n");

            writer.close();

            System.out.println("File created successfully");

            // READ FILE
            FileReader reader = new FileReader("sample.txt");

            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nReading File:\n");

            while ((line = br.readLine()) != null) {

                System.out.println(line);

            }

            br.close();

            // MODIFY FILE
            FileWriter modify = new FileWriter("sample.txt", true);

            modify.write("\nNew line added successfully");

            modify.close();

            System.out.println("\nFile modified successfully");

        }

        catch (IOException e) {

            System.out.println("Error Found");

        }
    }
}