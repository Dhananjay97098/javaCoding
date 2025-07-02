package jay.com.java;

import java.util.Scanner;

class FindMaxMin{
    public static void m3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        System.out.println("Enter the num3");
        int num3=sc.nextInt();
        //for  minimum
        int min;
        if(num1<num2&&num2<num3){
            min=num1;
        }
        else if (num2<num3){
            min=num2;
        }
        else{
            min=num3;
        }
        //for maximum
    int max;
        if (num1>num2&&num2>num3){
            max=num1;
        }
        else if (num2>num3){
            max=num2;
        }
        else{
            max=num3;
        }
        System.out.println("The minimum is :"+min);
        System.out.println("The maximum is :"+max);
    }
}

public class ThreeMinMax {
    public static void main(String[] args) {
        FindMaxMin.m3();
    }
}

