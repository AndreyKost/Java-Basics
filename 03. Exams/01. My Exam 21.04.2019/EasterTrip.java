import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String destination=scanner.nextLine();
        String dates=scanner.nextLine();
        int numOfnights=Integer.parseInt(scanner.nextLine());
        double price=0;


        if (dates.equalsIgnoreCase("21-23")) {
            if (destination.equalsIgnoreCase("France")) {
                price=30;
            } else if (destination.equalsIgnoreCase("Italy")) {
                price=28;
            } else if (destination.equalsIgnoreCase("Germany")) {
                price=32;
            }
        } else if (dates.equalsIgnoreCase("24-27")) {
            if (destination.equalsIgnoreCase("France")) {
                price=35;
            } else if (destination.equalsIgnoreCase("Italy")) {
                price=32;
            } else if (destination.equalsIgnoreCase("Germany")) {
                price=37;
            }
        } else if (dates.equalsIgnoreCase("28-31")) {
            if (destination.equalsIgnoreCase("France")) {
                price=40;
            } else if (destination.equalsIgnoreCase("Italy")) {
                price=39;
            } else if (destination.equalsIgnoreCase("Germany")) {
                price=43;
            }
        }

        double sumOftrip=price*(numOfnights*1.0);

        System.out.printf("Easter trip to %s : %.2f leva.",destination,sumOftrip);



    }
}
