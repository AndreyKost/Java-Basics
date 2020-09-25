import java.util.Scanner;

public class BoatForFishing {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int budget=Integer.parseInt(scan.nextLine());
        String season=scan.nextLine();
        int numOfFisherman=Integer.parseInt(scan.nextLine());
        double price=0;


        if (season.equals("Spring")) {
            if (numOfFisherman <=6) {
                price=3000 -(3000*0.1);
            } else  if (numOfFisherman>=7 && numOfFisherman <=11) {
                price=3000 -(3000*0.15);
            } else  if (numOfFisherman>=12) {
                price=3000-(3000*0.25);
            }
        } else if (season.equals("Summer")) {
            if (numOfFisherman <=6) {
                price=4200 -(4200*0.1);
            } else  if (numOfFisherman>=7 && numOfFisherman <=11) {
                price=4200 -(4200*0.15);
            } else  if (numOfFisherman>=12) {
                price=4200-(4200*0.25);
            }
        } else if (season.equals("Autumn")) {
            if (numOfFisherman <=6) {
                price=4200 -(4200*0.1);
            } else  if (numOfFisherman>=7 && numOfFisherman <=11) {
                price=4200 -(4200*0.15);
            } else  if (numOfFisherman>=12) {
                price=4200-(4200*0.25);
            }
        } else if (season.equals("Winter")) {
            if (numOfFisherman <=6) {
                price=2600 -(2600*0.1);
            } else  if (numOfFisherman>=7 && numOfFisherman <=11) {
                price=2600 -(2600*0.15);
            } else  if (numOfFisherman>=12) {
                price=2600-(2600*0.25);
            }
        }

        if (numOfFisherman%2==0 && (!season.equals("Autumn"))) {
            price=price*0.95;
        }

        if (budget>=price) {
         System.out.printf("Yes! You have %.2f leva left",budget-price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva",price-budget);
        }







    }
}
