package jokebot;
import bot.Bot;
import com.JSONReader;
import java.util.Scanner;

public class JokeBot extends Bot {

    @Override
    public void runBot() {
        // Scanner for user input
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Would you like to hear a joke? [ Y , N ]: ");

        // Holds users next keypress
        String keyPress = keyboardScanner.nextLine();

        // Counter for incorrect keypress
        int keyFailure = 0;

        if (keyPress.equals("Y") || keyPress.equals("y")) {
            System.out.println(this.doAction());
            this.runBot();
        }
        else if (keyPress.equals("N") || keyPress.equals("n")) {
            System.out.println("Okay! Thanks anyway!");
            System.exit(0);
        }
        else {
            keyFailure++;
            switch (keyFailure) {
                case 1 :
                    System.out.println("\nThat is not the correct key!");
                    this.runBot();
                case 2 :
                    System.out.println("\nHey! You pressed the wrong key again!");
                    this.runBot();
                case 3 :
                    System.out.println("\nOkay then, now you're just doing it to see what happens...");
                    System.out.println("\nJust press the Y or N key on your keyboard....please?");
                    this.runBot();
                case 4 :
                    System.out.println("\nAight, I'mma head out.");
                    System.exit(0);
            }
        }
    }

    @Override
    public String doAction() {
        return tellJoke();
    }

    private String tellJoke() {
        JSONReader jokeReader = new JSONReader();
        return jokeReader.readJokes();
    }
}
