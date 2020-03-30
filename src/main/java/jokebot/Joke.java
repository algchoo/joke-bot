package jokebot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Joke {

    public int id;
    public String theSetup;
    public String thePunchline;

    public String getJoke(int id) { return null; }

    public String listJokes(String type) { return null; }

    public void removeJoke(int id) {}

    public String toJsonString() {
        return "{\"setup\": " + theSetup + ", \"punchline\": " + thePunchline + "}";
    }

}
