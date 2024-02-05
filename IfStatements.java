import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your CAT marks: ");
        int CAT = scanner.nextInt();
        int MainExam = (int) (30+Math.ceil(Math.random()*30));
        int TotalMarks = CAT + MainExam;
        if(TotalMarks < 40){
            System.out.println("F");
        }
        else if(TotalMarks >= 40 && TotalMarks < 50){
            System.out.println("D");
        }
        else if(TotalMarks >= 50 && TotalMarks < 60){
            System.out.println("C");
        }
        else if(TotalMarks >= 60 && TotalMarks < 70){
            System.out.println("B");
        }
        else if(TotalMarks > 70 && TotalMarks < 100){
            System.out.println("A");
        }
        else{
            System.out.println("Enter correct CAT marks");
        }



    }
}