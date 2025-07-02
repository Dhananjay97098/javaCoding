package jay.com.java;
import java.util.Scanner;

class CharInput{
    public static void m2() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);
        System.out.println("the character is :"+ch);

    }
}
public class CharAsinput {
    public static void main(String[] args) {
        CharInput.m2();
    }
}
