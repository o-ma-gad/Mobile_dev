package com.tede.tede.request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ApiConnection {
    public static void main(String[] args) {
        try {

            // Create connection to the API end point, by default used GET method
            URL address = new URL("http://90.156.209.38/api/");
            HttpURLConnection connection = (HttpURLConnection) address.openConnection();
            connection.connect();


            // Set up input stream to read data from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Print server response to terminal
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

            // Close input stream after work is done
            in.close();

        } catch (MalformedURLException e) {
            System.out.println("Wrong URL address");
        } catch (IOException e) {
            System.out.println("Download error " + e.getMessage());
        }
    }
}
