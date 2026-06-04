import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {

    public static void main(String[] args) {

        try {

            // API Link
            String apiUrl = "https://official-joke-api.appspot.com/random_joke";

            // Create URL
            URL url = new URL(apiUrl);

            // Open Connection
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Request Method
            conn.setRequestMethod("GET");

            // Read API Response
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String line;

            System.out.println("API RESPONSE:\n");

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

            reader.close();
            conn.disconnect();

        }

        catch (Exception e) {

            System.out.println("Error occurred");

            e.printStackTrace();

        }
    }
}