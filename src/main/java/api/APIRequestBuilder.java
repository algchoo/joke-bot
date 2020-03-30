package api;

import jokebot.Joke;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class APIRequestBuilder {

//    It will have a type (GET, POST)
//    It will have a destination.
//    There will be a payload or response from the API
//    Use HttpUrlConnection

    private URL destinationURL;

    {
        try {
            destinationURL = new URL("https://localhost/api/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    private HttpURLConnection con;

    public HttpURLConnection buildPostJoke() {

        // Open connection
        try {
            con = (HttpURLConnection)destinationURL.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set to POST
        try {
            con.setRequestMethod("POST");
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        // Set Request Content-Type Header
        con.setRequestProperty("Content-Type", "application/json; utf-8");

        // Set response format
        con.setRequestProperty("Accept", "application/json");

        // Allow send request content
        con.setDoOutput(true);

        return con;
    }

    public void buildGetJoke(int id) {}
}