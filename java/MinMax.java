package jay.com.java;

import java.util.Scanner;

class A{
    public static void findMinMxa(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1=s.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2=s.nextInt();
        int min=Math.min(num1,num2);
        int max=Math.max(num1,num2);
        System.out.println("It is minimum: "+min);
        System.out.println("It is maximum: "+max);
        /*if (num1<num2){
            System.out.println(" num1 is max");
        }
        else {
            System.out.println("num2 is min");*/
        }

    }

public class MinMax {
    public static void main(String[] args) {
        A.findMinMxa();
    }

}
