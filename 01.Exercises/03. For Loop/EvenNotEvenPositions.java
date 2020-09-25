import java.util.Scanner;

public class EvenNotEvenPositions {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        double OddSum=0;
        double OddMax=-1000000000.0;
        double OddMin=1000000000.0;
        double EvenSum=0;
        double EvenMax=-1000000000.0;
        double EvenMin=1000000000.0;


        for (int i = 1; i <=n; i++) {
            double in=Double.parseDouble(scan.nextLine());

            if (i %2==0) {
                EvenSum+=in;
                if (in>EvenMax) {
                    EvenMax=in;
                }
                if(in<EvenMin){
                    EvenMin=in;
                }

            } else {
                OddSum+=in;
                if (in >OddMax) {
                    OddMax=in;
                }
                if(in <OddMin){
                    OddMin=in;
                }
            }

        }

        System.out.printf("OddSum=%.2f,%n",OddSum);

        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.printf("OddMin=%.2f,%n",OddMin);
        }
        if (OddMax == -1000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.printf("OddMax=%.2f,%n",OddMax);
        }
        
        System.out.printf("EvenSum=%.2f%n",EvenSum);
        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No");
        }else {
            System.out.printf("EvenMin=%.2f,%n",EvenMin);
        }

        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f,%n",EvenMax);
        }







    }
}
