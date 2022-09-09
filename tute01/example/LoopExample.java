package example;

public class LoopExample {
    public static void main(String[] args) {
        String[] myStrings = { "Hello", "World", "No" };

        // Index based looping
        for (int i = 0; i < myStrings.length; i++) {
            String current = myStrings[i];
            System.out.println(current);
        }

        // For-range / for-in loop
        for (String current : myStrings) { // Very python like
            System.out.println(current);
        }
    }
}