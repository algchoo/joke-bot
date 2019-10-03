package com;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader {

    // JSON Parser
    private JSONParser parser = new JSONParser();

    public void readJokes() {
        try(FileReader reader = new FileReader("JokeBot/jokes.json"))
        {
            Object jsonFile = parser.parse(reader);

            JSONArray jokeList = (JSONArray) jsonFile;
            System.out.println("jokeList");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
