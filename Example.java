import java.util.Random;

public class Example {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number from 0 to 35
        int num = random.nextInt(36);  // The argument is the upper bound (exclusive)

        // Print the generated number
        System.out.println("Random number: " + num);
    }
}
