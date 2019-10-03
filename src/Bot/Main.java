package Bot;

import JokeBot.JokeBot;

public class Main {

    public static void main(String[] args) {

        /* Run a function that starts the bot. */
        JokeBot Joker = new JokeBot();

        // Bot Says Hello
        System.out.println(Joker.sayHello());
    }
}
