import java.util.Scanner;

public class Method2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the points scored: ");
        double userpoints = scanner.nextDouble();
        rankPoints(userpoints);

    }
    public static void rankPoints(double points){
        if(points >= 202.5){
            System.out.println("Rank: A");
        }
        else if(points >= 102.5){
            System.out.println("Rank: B");
        }
        else{
            System.out.println("Rank: C");
        }

    }
}