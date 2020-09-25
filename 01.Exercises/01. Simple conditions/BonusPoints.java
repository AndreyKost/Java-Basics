import java.util.Scanner;

public class BonusPoints {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int value1=Integer.parseInt(scan.nextLine());
        double bonusPoints=0;

        if (value1 <=100) {
             bonusPoints=5;
        }
        else if (value1 > 1000) {
            bonusPoints=0.10*value1;
        }
        else {
            bonusPoints=0.20*value1;
        }


        if (value1%2==0) {
             bonusPoints+=1;
        }
        else if (value1%10==5) {
            bonusPoints+=2;
        }

        System.out.println(bonusPoints);
        System.out.println(value1+bonusPoints);
        //System.out.println(0.10*value1);


    }
}
