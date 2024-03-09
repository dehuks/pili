public class This_Example{
    //Instance variable num
    int num = 10;
    This_Example(){
        System.out.println("This is an example of a program with the this keyword.");
    }
    This_Example(int num){
        this();//Invoking the default constructor
        //Assigning the local variable num to the instance variable num
        this.num = num;
    }
    public void greet(){
        System.out.println("Hi welcome to java programming");
    }
    public void print(){
        //local variable num
        int num = 20;
        //Printing the local variable
        System.out.println("Value of local variable num is "+num);
        //Printing the instance variable
        System.out.println("Value of the instance variable num is:" + this.num);
        //Invoking  the greet method of a class
        this.greet();
    }
    public static void main(String[] args){
        //Instantiating the class
        This_Example obj1 = new This_Example();
        // Invoking the print method
        obj1.print();
        //Passing the new value to the num variable through parameterized constructor
         This_Example obj2 = new This_Example(30);
         obj2.print();

    }
}