package jay.com.java;

import java.util.Scanner;

class SwepingNo{
    public static void m1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("the first i:");
        int i=sc.nextInt();
        System.out.println("the second j:");
        int j= sc.nextInt();
        //Without using 3rd variable
        /* i=j+i;
         j=i-j;
         i=i-j;*/
        //Using 3rd variable
        /*int a=0;
        a=i+j;
        i=a-i;
        j=a-i;*/
        //using bitwise oprator
        i=j^i;
        j=i^j;
        i=i^j;
        System.out.println("the i is:"+i+"  "+" the j is:"+j);
    }
}

public class Swap {
    public static void main(String[] args) {
        SwepingNo.m1();
    }
}
