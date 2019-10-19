package com;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Random;

public class JSONReader {

    // JSON Parser
    private JSONParser parser = new JSONParser();

    public String readJokes() {
        try(FileReader reader = new FileReader("/home/algchoo/IdeaProjects/Bots/src/main/java/com/jokes.json"))
        {
            ArrayList<String> categories = new ArrayList<>();
            categories.add("dadJokes");
            categories.add("antiJokes");
            categories.add("puns");

            Random rand = new Random();
            JSONObject jsonFile = (JSONObject) parser.parse(reader);

            int jokeType = rand.nextInt(3);
            JSONArray test = (JSONArray) jsonFile.get(categories.get(jokeType));

            int joke = rand.nextInt(6);
            return (String) test.get(joke);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
