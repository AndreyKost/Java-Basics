import java.util.Scanner;

public class Steps2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int totalSteps=0;


        while (totalSteps<10000){
            String input=scan.nextLine();

            if (input.equals("Going Home")) {
                int bonusSteps=Integer.parseInt(scan.nextLine());
                totalSteps+=bonusSteps;
                if (totalSteps>=10000) {
                    break;
                }
                break;
            }
             int steps=Integer.parseInt(input);
            totalSteps+=steps;

        }

        if (totalSteps>=10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal",10000-totalSteps);
        }




    }
}
