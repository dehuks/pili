public class Method3{
    public static void main(String[] args){
        int a = 167;
        int b = 314;
        int c = 212;

        int s = sum(a, b, c);
        System.out.println("The sum of the numbers is: "+s);
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}