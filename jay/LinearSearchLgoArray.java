package practices.java.jay;

public class LinearSearchLgoArray {
    public static int searchNo(int[] marks, int target) {
        for (int i = 0; i <= marks.length; i++) {
            if (marks[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] marks={12,20,46,40,34,90,30,};
        int target=50;
        int Index=searchNo(marks,target);
        if (Index== -1){
            System.out.println("Number is not exist");
        }else{
            System.out.println("Target is at the index: "+ Index);
        }
    }
}
