import java.util.Scanner;
class Rectangle{
    int width;
    int length;

    Rectangle(){
        width = 10;
        length = 15;
    }
    Rectangle(int w, int l){
        width = w;
        length = l;
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int w){
        width = w;
    }
    public void setLength(int l){
        length = l;
    }
    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2*(length + width);
    }

}
public class RectMain1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width: ");
        int wid = scan.nextInt();
        System.out.println("Enter length: ");
        int len = scan.nextInt();
        Rectangle rect= new Rectangle(wid, len);
        printRectangle(rect);
    }
    public static void printRectangle(Rectangle R){
        System.out.println("The width of the rectangle is: "+ R.getWidth());
        System.out.println("The length of the rectangle is: "+ R.getLength());
        System.out.println("The area of the rectangle is: "+ R.area());

    }
}