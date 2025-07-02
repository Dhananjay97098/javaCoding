package practices.java.jay;
import java.util.Scanner;
//wap to read month and year and display the number of days for that month
public class FindItDayOrMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the month:");
        int month=sc.nextInt();
        System.out.println("Enter the year:");
        int year=sc.nextInt();
        int day =0;
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day=31;
                break;
            case 4: case 6: case 9: case 11:
                day=30;
                break;
            case 2:
                if ((year%4==0&&year%100!=0)||(year%400==0)){
                    day=29;
                }else{
                    day=28;
                }
            default :
                System.out.println("Invalid number plzz.. press valid No");
        }
        System.out.println("  year is  :" +year+"  month is  :"+ month+"  day is  :"+ day);

    }
}
