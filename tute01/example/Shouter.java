package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Shouter {
    private String message; // this.message

    public Shouter(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Hello World");
        s.shout();
        s.setMessage("howdy");
        s.shout();
        System.out.println(s.getMessage());
    }

}
