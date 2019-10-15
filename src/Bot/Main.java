package Bot;

import JokeBot.JokeBot;
import SmiteQueueBot.SmiteQueueBot;

public class Main {

    public static void main(String[] args) {

        JokeBot Joker = new JokeBot();

        System.out.println(Joker.sayHello());
        Joker.runBot();
    }
}
