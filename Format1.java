import java.util.*;

public class Format1{
  public static void main(String[] args){
    String str = "John Michael";
    String str1=String.format("My name is %s", str);
    String str2=String.format("My value is %15d",47);
    String str3=String.format("My value is %015d",47);
    String str4=String.format("My answer is %015.8f",47.65);
    String str5=String.format("My answer is %015.6f",47.65);
    String str6=String.format("My answer is %015.1f",47.65);

    System.out.println(str);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);
    System.out.println(str6);
  }
}

