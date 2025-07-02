package jay.com.java;

import java.util.Scanner;

class Test{
    public static void findPossativeOrNeg(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("It is posstive number");
        }
        else{
            System.out.println("It is negative number");
        }
    }
}
public class NoPossativeOrNegative {
    public static void main(String[] args) {
        Test.findPossativeOrNeg();
    }
}
