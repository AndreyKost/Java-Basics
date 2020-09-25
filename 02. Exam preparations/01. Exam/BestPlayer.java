import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nameOfPlayer=scanner.nextLine();
        //int numScoredGoals=Integer.parseInt(scanner.nextLine());
        int max=0;
        String bestname="";
        boolean hattrick=false;


        while (!nameOfPlayer.equalsIgnoreCase("END")){
            int maxGoals=Integer.parseInt(scanner.nextLine());
            if(maxGoals>max){
                max=maxGoals;
                bestname=nameOfPlayer;
            }
            if (maxGoals>=3) {
                hattrick=true;
            }
            if (maxGoals>=10) {
                break;
            }

            nameOfPlayer=scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n",bestname);

        if (hattrick) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!",max);
        } else {
            System.out.printf("He has scored %d goals.",max);
        }



    }
}
