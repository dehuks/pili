import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rates
        double exchangeRateKshToUsh = 24;
        double exchangeRateUsdToUsh = 1950;

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in Kenyan shillings: ");
        double amountKsh = scanner.nextDouble();


        double amountUsh = amountKsh * exchangeRateKshToUsh;


        double amountUsd = amountUsh / exchangeRateUsdToUsh;

       
        System.out.printf("%.2f Kenyan shillings is equal to %.2f US dollars%n", amountKsh, amountUsd);


        scanner.close();
    }
}
