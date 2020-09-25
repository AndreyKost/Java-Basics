import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double budget=Double.parseDouble(scan.nextLine());
        String season=scan.nextLine();
        double spendings=0.0;
        String whereToRest=null;

        if (budget<=100) {
            if (season.equals("summer")) {
                spendings=0.3*budget;
                whereToRest="Camp";
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }
            else {
                spendings=0.7*budget;
                whereToRest="Hotel";
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }
        } else if (budget>=100 && budget<=1000) {
            if (season.equals("summer")) {
                spendings=0.4*budget;
                whereToRest="Camp";
                System.out.println("Somewhere in the Balkans");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }
            else {
                spendings=0.8*budget;
                whereToRest="Hotel";
                System.out.println("Somewhere in the Balkans");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }

        } else if (budget>=1000) {
            if (season.equals("summer")) {
                spendings=0.9*budget;
                whereToRest="Camp";
                System.out.println("Somewhere in Europe");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }
            else {
                spendings=0.9*budget;
                whereToRest="Hotel";
                System.out.println("Somewhere in Europe");
                System.out.printf("%s - %.2f",whereToRest,spendings);
            }
        }



    }
}
