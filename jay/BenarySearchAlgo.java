package practices.java.jay;

public class BenarySearchAlgo {
    public static int binarySearch1(int [] number,int target) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == target) {
                System.out.println("found");
                return mid;
            }
            if (number[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
            int[] number = {2, 4, 6, 10, 12, 15};
            int target = 6;
            System.out.println("The target of no is :" + binarySearch1(number, target));
        }
    }

