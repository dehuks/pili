//Lines of code on finding areas of basic shapes
import java.util.Scanner;

public class Areas{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Select a shape to calculate its area: ");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");

        int choice = scan.nextInt();

        switch(choice){
            case 1 :
                CalculateRectangleArea(scan);
                break;
            case 2 :
                CalculateTriangleArea(scan);
                break;
            case 3 :
                CalculateCircleArea(scan);
                break;
            default :
                System.out.println("Invalid choice please input a choice that is provided.");
        }


    }
    //Calculates and prints area of a rectangle
    public static void CalculateRectangleArea(Scanner scan){
        
        System.out.println("Area of rectangle");
        System.out.println("Enter length of the rectangle: ");
        int length = scan.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = scan.nextInt();
        int area = length * width;
        System.out.println("The are of the rectangle is  "+area);
    }
    //Calculates and prints area of a triangle
    public static void CalculateTriangleArea(Scanner scan){
        System.out.println("Area of triangle");
        System.out.println("Enter the base length of triangle: ");
        double baseLength = scan.nextDouble();
        System.out.println("Enter height of triangle: ");
        double height = scan.nextDouble();
        double area = 0.5* baseLength * height;
        System.out.println("The area of the triangle is "+area);
    }
    //Calculates and prints area of a circle
    public static void CalculateCircleArea(Scanner scan){
        System.out.println("Area of a circle");
        System.out.println("Enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is "+area);

    }
}