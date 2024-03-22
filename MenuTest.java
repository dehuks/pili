import java.util.*;
class MenuTest{
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args){
    menu();//Calling the recursive Method
  }//End of main method
  
  //Reccursive method menu
  public static void menu(){
    int option;
    System.out.println("Enter[1] to print the integer numbers: ");
    System.out.println("Enter[2] to print squares: ");
    System.out.println("Enter[3] to print cube roots: ");
    System.out.println("Enter[4] to Exit the system: ");
    option = scan.nextInt();
    switch(option){
	      case 1:
		printInteger();
		break;
	      case 2:
		printSquares();
		break;
	      case 3:
		printCubes();
		break;
	      case 4:
		System.out.println("You have exited the system...");
	        System.exit(0);
	        break;
	      default:
	      System.out.println("Invalid choice");
	      break;
	    }
	    menu();
  }//End of menu method
  
   //Methods
  public static void printInteger(){
    for(int i = 0; i<10; i++){
      System.out.println(i+"\t");
    }//ENd of for loop
  }//End of print integer
  
  public static void printSquares(){
    for(int i = 0; i<10; i++){
      System.out.println(Math.pow(i, 2)+"\t");
    }
  }//End of print squares
  
  public static void printCubes(){
    for(int i = 0; i<10; i++){
      System.out.println(Math.pow(i, 3)+"\t");
    }
  }//End of print cubes
}