// Code illustrating sum of numbers using both the while loop and the do while loop
public class While2{
    public static void main(String[] args){
        // callling the methods used the
        DoWhile();
        WhileAdd();
        MinusEqual();

    }
    public static void DoWhile(){
        int number = 100;
        int sum = 0;

        do{
            sum += number;
            number --;
        }while(number > 0 );

        System.out.println("Do-while statement. The sum of the numbers between 1 and 100 is "+ sum);
    }
    public static void WhileAdd(){
        int number = 0;
        int sum = 0;

        while(number <= 100){
            sum += number;
            number ++;
        }

        System.out.println("While statement. The sum of the numbers between 1 and 100 is "+ sum);
    }

    public static void MinusEqual() {
            int number = 100;
            int sum = 0;

            do {
                sum -= number;
                number--;
            } while (number > 0);

            System.out.println("Minus Equal. The sum of numbers from 1 to 100 using -= is: " + sum);
    }

}