package practices.java.jay;
import java.util.*;

public class LargestValue_in_Array {
    public  static int findLargest(int[] numbers){
        int largests=Integer.MIN_VALUE;
        int smallests=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (largests<=numbers[i]){
                largests=numbers[i];
            }
            if (smallests>numbers[i]){
                smallests=numbers[i];
                System.out.println("the Smallest value of :"+smallests);
            }
        }return largests;
    }
    public static void main(String[] args) {
     int [] numbers={3,6,9,10,20,4,8};
        System.out.println("The max value is :"+findLargest(numbers));

    }
}
