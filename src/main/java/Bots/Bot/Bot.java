package Bot;

public abstract class Bot {

    public String name;
    public String message;

    public String sayHello() {
        return "Hello there!";
    }

    public abstract void runBot();

    public abstract String doAction();
}
