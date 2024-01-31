import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's score: ");
        double score = scanner.nextDouble();

        char grade;

        if (score >= 90.0) {
            grade = 'A';
        } else if (score >= 80.0) {
            grade = 'B';
        } else if (score >= 70.0) {
            grade = 'C';
        } else if (score >= 60.0) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Student's grade: " + grade);

        scanner.close();
    }
}
