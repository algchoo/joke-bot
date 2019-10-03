package JokeBotApp;
import java.util.Scanner;

public class JokeBot extends Bot {

    @Override
    public void runBot() {
        // Scanner for user input
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Would you like to hear a joke? [ Y , N ]: ");

        // Holds users next keypress
        String keyPress = keyboardScanner.nextLine();

        if (keyPress.equals("Y")) {
            System.out.println(this.doAction());
        }

        if (keyPress.equals("N")) {
            System.out.println("Okay! Thanks anyway!");
            System.exit(0);
        }
        else {
            System.exit(1);
        }
    }

    @Override
    public String doAction() {
        return tellJoke();
    }

    private String tellJoke() {
        return "Why are people like drums?\nHit them with a stick and they make a noise.";
    }
}
