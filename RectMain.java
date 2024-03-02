import java.util.Scanner;
class Rectangle{
    int width;
    int length;
    Rectangle(){
        width = 10;
        length= 15;
    }
    Rectangle(int w, int l){
        width = w;
        length =l;

    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return width;
    }
    public void setWidth(int w){
        width = w;
    }
    public void setLength(int l){
        length =l;
    }
    public int area(){
        return width*length;
    }
    public int perimeter(){
        return 2*(length + width);
    }
}
public class RectMain{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("The are of the rectangle is "+ r1.area());
        System.out.println("Enter the width of second rectangle: ");
        int wid = scan.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int len = scan.nextInt();
        Rectangle r2 = new Rectangle(wid, len);
        System.out.println("The area of the second rectangle is: "+r2.area());
    }
}