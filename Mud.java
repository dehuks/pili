import java.util.Scanner;
class Marks{
  int cat1;
  int cat2;
  int exam;
  Marks(){
      this.cat1= 2;
      this.cat2 = 4;
      this.exam = 10;
  }
  Marks(int cat1, int cat2, int exam ){
      this.cat1 = cat1;
      this.cat2 = cat2;
      this.exam = exam;
  }
  //Method to calculate sum of cat 1 and cat 2
    public int catSum(){
      return cat1 + cat2;
    }//End of method
    //Method to calculate aggregate
    public int aggMarks(){
      return cat1 + cat2 + exam;
    }//End of method
    //Method to determine the grade based on the aggregate marks
    public char grade(int aggMarks){
      if (aggMarks >= 80){
          return 'A';
      }
      else if(aggMarks >= 60){
          return 'B';
      }
      else if (aggMarks >= 50){
          return 'C';
      }
      else if (aggMarks >= 40){
          return 'D';
      }
      else{
          return 'F';
      }
    }//End of method

}//End of class Marks
public class Mud{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //using default marks
        Marks defaultMarks = new Marks();
        displayMarks(defaultMarks);

        //Using parameterized constructor
        System.out.println("Enter CAT 1 marks: ");
        int cat1 = scanner.nextInt();
        System.out.println("Enter CAT 2 marks: ");
        int cat2 = scanner.nextInt();
        System.out.println("Enter the exam marks: ");
        int exam = scanner.nextInt();

        Marks customMarks = new Marks( cat1, cat2, exam);
        displayMarks(customMarks);

        scanner.close();

    }
    public static void displayMarks(Marks marks) {
        System.out.println("CAT 1\t CAT 2\t EXAM \t GRADE");
        System.out.println(marks.cat1 + "\t" + marks.cat2 + "\t" + marks.exam + "\t" + marks.grade(marks.aggMarks()));
        System.out.println();
    }
}