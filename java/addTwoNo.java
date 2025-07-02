package jay.com.java;
import java.util.Scanner;

class AddNo{
    public static void add1(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st No:");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd No:");
        int num2=sc.nextInt();
        int sum=num1+num2;
       System.out.println("Addition of  Two no: "+sum);
    }
}
public class addTwoNo {
    public static void main(String[] args) {
        AddNo.add1();
    }
}
