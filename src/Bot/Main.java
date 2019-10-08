package Bot;

import JokeBot.JokeBot;
import SmiteQueueBot.SmiteQueueBot;

public class Main {

    public static void main(String[] args) {

        /* Run a function that starts the bot. */
        JokeBot Joker = new JokeBot();
        SmiteQueueBot queueBot = new SmiteQueueBot();

        // Bot Says Hello
//        System.out.println(Joker.sayHello());
//        Joker.runBot();

        queueBot.runBot();
    }
}
