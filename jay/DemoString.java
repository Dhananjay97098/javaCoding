package practices.java.jay;

public class DemoString {
        public static void main(String[] args)
        {
            String str1 = "Java";

            String str2 = new String("Java");

            System.out.println(str1 == str2);//false

            System.out.println(str1.equals(str2));//true

            System.out.println(str1.hashCode() == str2.hashCode());//true
        }
    }

