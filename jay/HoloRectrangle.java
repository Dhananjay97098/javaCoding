package practices.java.jay;

public class HoloRectrangle {
    public static void holoPattern(int tRow,int tCol){
        //outer Loop
        for (int i=1;i<=tRow;i++){
            //outer loop
            for (int j=1; j<=tCol;j++){
                if (i==1||i==tRow||j==1||j==tCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        HoloRectrangle.holoPattern(4,5);
    }
}

    /*
     ******
     *    *
     *    *
     *    *
     ******
     */