package practices.java.jay;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

//wap  to read a number 0-6 and display corresponding weekend name.
public class Test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 0-6 number: ");
        int day=sc.nextInt();
        switch (day){
         case 0:
         System.out.println("sunday");
            break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday is the Weekend");
                break;
            default :
                System.out.println("invalid operation");
        }

    }
}
