package practices.java.jay;

public class Half_peramid {
    public static   void halfPiramid(int n){
        //for Spaces
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }


    public static void main(String[] args) {
        Half_peramid.halfPiramid(6);

    }
}
