import java.util.Scanner;

public class OperationsBetweenNums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double N1=Double.parseDouble(scan.nextLine());
        double N2=Double.parseDouble(scan.nextLine());
        String operator=scan.nextLine();

        if (operator.equals("+")) {
            double sum=N1+N2;
            if (sum%2==0) {
                System.out.printf("%.0f %s %.0f = %.0f - even",N1,operator,N2,sum);
            }
            else{
                System.out.printf("%.0f %s %.0f = %.0f - odd",N1,operator,N2,sum);
            }
        } else if (operator.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero",N1);
            } else {
                double sum=N1/N2;
                System.out.printf("%.0f %s %.0f = %.2f - odd",N1,operator,N2,sum);
            }
        } else if (operator.equals("-")) {
            double sum=N1-N2;
            if (sum%2==0) {
                System.out.printf("%.0f %s %.0f = %.0f - even",N1,operator,N2,sum);
            }
            else{
                System.out.printf("%.0f %s %.0f = %.0f - odd",N1,operator,N2,sum);
            }
        } else if (operator.equals("*")) {
            double sum=N1*N2;
            if (sum%2==0) {
                System.out.printf("%.0f %s %.0f = %.0f - even",N1,operator,N2,sum);
            }
            else{
                System.out.printf("%.0f %s %.0f = %.0f - odd",N1,operator,N2,sum);
            }
        } else if (operator.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero",N1);
            } else {
                double sum=N1%N2;
                System.out.printf("%.0f %s %.0f = %.2f - odd",N1,operator,N2,sum);
            }
        }




    }
}
