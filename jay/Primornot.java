package practices.java.jay;
//wap to read the input from to user whether it is prim or not

import java.util.Scanner;

public class Primornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  value=sc.nextInt();
        if(value%2!=0){
            System.out.println("it is the prime no");
        }else{
            System.out.println("it is not a prime no");
        }

    }
}
