package jay.com.java;

import java.util.Scanner;

class Men{
    public static void elegableForVoting(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the men age:");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Elegiable for voting");
        }
        else {
            System.out.println("Not elegiable for voting");
        }


    }
}
public class Voting {
    public static void main(String[] args) {
   Men.elegableForVoting();
    }
}
