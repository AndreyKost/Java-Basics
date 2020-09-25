import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int countp1=0;
        int countp2=0;
        int countp3=0;
        int countp4=0;
        int countp5=0;


        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200) {
                countp1++;
            } else if (number >= 200 && number <= 399) {
                countp2++;
            } else if (number >= 400 && number <= 599) {
                countp3++;
            } else if (number >= 600 && number <= 799) {
                countp4++;
            } else if (number > 800) {
                countp5++;
            }


        }
            double p1=(countp1*1.0/n)*100;
            double p2=(countp2*1.0/n)*100;
            double p3=(countp3*1.0/n)*100;
            double p4=(countp4*1.0/n)*100;
            double p5=(countp5*1.0/n)*100;

            System.out.printf("%.2f%%\n",p1);
            System.out.printf("%.2f%%\n",p2);
            System.out.printf("%.2f%%\n",p3);
            System.out.printf("%.2f%%\n",p4);
            System.out.printf("%.2f%%\n",p5);









    }
}
