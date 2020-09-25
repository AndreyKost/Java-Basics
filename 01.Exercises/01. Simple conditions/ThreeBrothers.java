import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double brotherA=Double.parseDouble(scan.nextLine());
        double brotherB=Double.parseDouble(scan.nextLine());
        double brotherC=Double.parseDouble(scan.nextLine());
        double fatherD=Double.parseDouble(scan.nextLine());
        double allTimeABC=1/(1/brotherA+1/brotherB+1/brotherC);
         double timeWithRest=allTimeABC + (0.15*allTimeABC);
         System.out.printf("Cleaning time: %.2f%n",timeWithRest);
         double timeLeft=fatherD - timeWithRest;

        if (timeLeft >=0) {
            System.out.printf("Yes,there is a suprise - time left %.2f",Math.floor(timeLeft));
        }
        else {
            System.out.printf("No,there isn't a surprise - shortage of time -> %.0f hours",Math.ceil(Math.abs(timeLeft)));
        }





    }
}
