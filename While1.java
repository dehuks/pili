//Prints any number between 1 and 10 and if not request for another input until condition is met
import java.util.Scanner;

public class While1{
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10: ");
        int n = b.nextInt();

        while (n < 1 || n > 10){
            System.out.println("Please enter again.");
            n = b.nextInt();
        }

    }
}