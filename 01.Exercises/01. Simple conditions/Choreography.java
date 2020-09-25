import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            double numberSteps=Double.parseDouble(scan.nextLine());
            double numberDancers=Integer.parseInt(scan.nextLine());
            double numberOfDays=Double.parseDouble(scan.nextLine());

            double allStepsPerDay=(numberSteps/numberOfDays)/numberSteps;
            double stepsForDancer=allStepsPerDay/numberDancers;
          //  System.out.printf("%.2f",allStepsPerDay);
              //System.out.printf("%.2f",stepsForDancer);
                System.out.println(stepsForDancer);

       /* if (allStepsPerDay <=0.13) {
            System.out.printf("Yes,they will succeed in that goal! Required steps "%2.f" to be learned per day.",stepsForDancer);
        }
         else {
            System.out.printf("No,they will not succeed in that goal! Required steps "%2.f"  to be learned per day.",stepsForDancer);
        }*/

    }
}
