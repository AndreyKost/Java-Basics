import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String typeOfProjection=scan.nextLine();
        int rows=Integer.parseInt(scan.nextLine());
        int columns=Integer.parseInt(scan.nextLine());
        double income=0;

        if (typeOfProjection.equals("Premiere")) {
            income=(rows*columns)*12;
        } else if (typeOfProjection.equals("Normal")) {
            income=(rows*columns)*7.50;
        } else if (typeOfProjection.equals("Discount")){
            income=(rows*columns)*5.0;
        }
        else {
            System.out.println("Error");
        }

        System.out.printf("%.2f leva",income);







    }
}
