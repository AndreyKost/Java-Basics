import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numOfGuests=Integer.parseInt(scanner.nextLine());
        int budget=Integer.parseInt(scanner.nextLine());

        int numOfEasterBread=0;
        if (numOfGuests%3==0) {
            numOfEasterBread=numOfGuests/3;
        } else {
            numOfEasterBread=(numOfGuests/3)+1;
        }

       // int numOfEasterBread=(numOfGuests/3);
        int numOfEggs=numOfGuests*2;

        double sumOfEasterBread=(numOfEasterBread*1.0)*4;
        double sumOfEggs=(numOfEggs*1.0)*0.45;

        double allSum=sumOfEasterBread+sumOfEggs;

        if (budget>=allSum) {
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n",numOfEasterBread,numOfEggs);
            System.out.printf("He has %.2f lv. left.",budget-allSum);
        } else {
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.",allSum-budget);
        }






    }
}
