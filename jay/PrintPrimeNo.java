package practices.java.jay;

import java.util.Scanner;

public class PrintPrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Frstno: ");
        int a=sc.nextInt();
        System.out.println("Enter the secondno: ");
        int b=sc.nextInt();
      //  boolean c=true;
        for (int i=a;i<=b;i++){
                System.out.println("It is prime no: "+i);
            }
        }
    }

