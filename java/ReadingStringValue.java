package jay.com.java;
import java.util.Scanner;

class TakingInput{
    public static  void m1(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a String:");
      //  String s2=s1.nextLine();
        int s2= s1.nextInt();
        System.out.println(s2);
       // return "the String is: "+s2;
    }
}

public class ReadingStringValue {
    public static void main(String[] args) {
       TakingInput.m1();
        System.out.println("hii");
    }
}
