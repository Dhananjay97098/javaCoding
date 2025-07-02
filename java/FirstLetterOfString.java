package jay.com.java;
import java.util.Scanner;

class FindFrstLet{
    public static void  findLetter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s1=sc.nextLine();
        System.out.println("String Length : " + s1.length());
       // for(int i=0;i<=s1.length()-1;i++){
            System.out.println(s1.charAt(0));
        }
    }

public class FirstLetterOfString {
    public static void main(String[] args) {
        FindFrstLet.findLetter();
    }
}
