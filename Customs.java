import java.util.Scanner;

public class Customs{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of the imported item: ");
        double price = scan.nextDouble();
        double customDutyPercentage = 30;
        double customDuty = price * customDutyPercentage/100;
        double purchaseTaxPercentage = 20;
        double purchaseTax = ((price + customDuty)*purchaseTaxPercentage/100);
        double totalPercentage = (customDuty+purchaseTax)/price*100;
        System.out.printf(" Custom duty: %.2f", customDuty);
        System.out.printf("Purchase Tax %.2f", purchaseTax);
        System.out.printf("The total percentage charged:  %.2f%%%n", totalPercentage);

        scan.close();
    }
}