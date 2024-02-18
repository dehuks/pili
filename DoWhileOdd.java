//Code to print odd using Do-while loop
public class DoWhileOdd{
    public static void main(String[] args){
        int i = 0;
        do{
            if(i % 2 == 1){
                System.out.println(i);
            }
            i++;
        }
        while(i <= 100);
    }
}