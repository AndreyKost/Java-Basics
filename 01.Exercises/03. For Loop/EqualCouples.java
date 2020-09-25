import java.util.Scanner;

public class EqualCouples {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int lastPair=0;
        int maxdiff=0;

        for (int i = 0; i <n ; i++) {
            int firstNum=Integer.parseInt(scan.nextLine());
            int secondNum=Integer.parseInt(scan.nextLine());
            int currentpair=firstNum+secondNum;
            if (i >=1) {
                int diff=Math.abs(currentpair-lastPair);
                if (diff>maxdiff) {
                    maxdiff=diff;
                }
            }
            lastPair=currentpair;

        }

        if (maxdiff==0) {
            System.out.printf("Yes, value=%d",lastPair);
        } else {
            System.out.printf("No, maxdiff=%d",maxdiff);
        }





    }
}
