package api;

import java.io.*;
import java.net.HttpURLConnection;
import jokebot.Joke;

public class APIRequestSender {

    public void sendJokePost(HttpURLConnection con, Joke j) {

        // Joke to jsonString
        String json = j.toJsonString();

        // Send the JSON to the API
        try(OutputStream os = con.getOutputStream()) {
            try {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read response from API
        try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
