package jay.com.java;

import java.util.Scanner;

class ConverteToC{
    public static void m1(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Farenhiehete:");
        int f=sc.nextInt();
        double c=(f-32)*5/9;
        System.out.println("Converte To Cielcse:"+c);
    }
}
public class ConvertFtoC {
    public static void main(String[] args) {
        ConverteToC.m1();
    }
}