package practices.java.jay;

public class ReverseAnArray {
    public static void reverseArray(int[] numbers){
        int start=0, end=numbers.length-1;
        while (start<end){
            int temp;
            temp=numbers[start];
            numbers[start]=numbers[end];
            numbers[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] numbers={3,6,7,9,10,23,24,35};
        reverseArray(numbers);
//  for (int i=0;i<numbers.length;i++){
        for (int i:numbers){
           // System.out.print(numbers[i]+",  ");
            System.out.print(i+", ");
        }
        System.out.println();
    }

}
