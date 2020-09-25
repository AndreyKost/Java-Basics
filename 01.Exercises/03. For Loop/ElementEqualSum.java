import java.util.Scanner;

public class ElementEqualSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int sum=0;
        int max=Integer.MIN_VALUE;




        for (int i = 1; i <=n ; i++) {
            int in=Integer.parseInt(scan.nextLine());
            sum+=in;
            if (in>max) {
                max=in;
            }

        }

        int sum2=sum-max;

        if (sum2==max) {
            System.out.printf("Yes%n Sum=%d",sum2);
        } else {
            System.out.printf("No%n Diff=%d",Math.abs(max-sum2));
        }




    }
}
