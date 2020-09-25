import java.util.Scanner;

public class DivisionWithoutResidue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int P1count=0;
        int P2count=0;
        int P3count=0;

        for (int i = 0; i <n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());

            if (number%2==0) {
                P1count++;
            }
            if (number %3==0) {
                P2count++;
            }
            if (number %4==0) {
                P3count++;
            }
        }

        double p1=(P1count*1.0/n) *100;
        double p2=(P2count*1.0/n)*100;
        double p3=(P3count*1.0/n)*100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);



    }
}
