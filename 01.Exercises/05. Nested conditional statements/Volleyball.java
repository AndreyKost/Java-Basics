import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        String year=scan.nextLine();
        double p=Double.parseDouble(scan.nextLine());
        int h=Integer.parseInt(scan.nextLine());

        int weekends=48 -h;
        double SaturdaysGames=weekends*(3.0/4);
        int numOfGamesHome=h;
        double holidayGames=p*(2.0/3);
        double allGames=SaturdaysGames+numOfGamesHome+holidayGames;

        if (year.equals("leap")) {
            allGames=allGames+(0.15*allGames);
            System.out.printf("%.0f",Math.floor(allGames));
        } else {
            System.out.printf("%.0f",Math.floor(allGames));
        }



    }
}
