import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeOfDay=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        int price=0;
        boolean isvalid=false;


        if (age>=0 && age<=18) {
            if (typeOfDay.equalsIgnoreCase("Weekday")) {
                price=12;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Weekend")) {
                price=15;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Holiday")) {
                price=5;
                isvalid=true;
            } else {
                System.out.println("Error!");
            }
        } else if (age>18 && age<=64) {
            if (typeOfDay.equalsIgnoreCase("Weekday")) {
                price=18;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Weekend")) {
                price=20;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Holiday")) {
                price=12;
                isvalid=true;
            } else {
                System.out.println("Error!");
            }
        } else if (age>64 &&  age<=122) {
            if (typeOfDay.equalsIgnoreCase("Weekday")) {
                price=12;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Weekend")) {
                price=15;
                isvalid=true;
            } else if (typeOfDay.equalsIgnoreCase("Holiday")) {
                price=10;
                isvalid=true;
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }


        if (isvalid) {
            System.out.printf("%d$",price);
        }


    }
}
