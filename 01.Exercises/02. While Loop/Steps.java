import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int totalSteps=0;
        String command=scan.nextLine();

        while(totalSteps<10000 && !"Going home".equals(command)){
            int steps=Integer.parseInt(command);
            totalSteps+=steps;
            if (totalSteps>=10000) {
                System.out.printf("Goal Reached! Good Job!");
                break;
            }
            command=scan.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsToHome=Integer.parseInt(scan.nextLine());
            if (totalSteps+stepsToHome>=10000) {
                System.out.println("Goal Reached! Good Job!");
            } else {
                System.out.printf("%d more steps to reach goal",10000-totalSteps-stepsToHome);
            }



        }





    }
}
