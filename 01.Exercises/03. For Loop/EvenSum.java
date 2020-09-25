import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int sumEven=0;
        int sumNotEven=0;

        for (int i = 1; i <=n ; i++) {
            int in=Integer.parseInt(scan.nextLine());

            if (i%2==0) {
                sumEven+=in;
            } else {
                sumNotEven+=in;
            }
        }

        if (sumEven == sumNotEven) {
            System.out.printf("Yes%nSum = %d",sumEven);
        } else {
            System.out.printf("No%nDiff = %d",Math.abs(sumNotEven-sumEven));
        }





    }
}
