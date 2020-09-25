import java.util.Scanner;

public class Scolarship {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double income=Double.parseDouble(scan.nextLine());
        double averageSuccess=Double.parseDouble(scan.nextLine());
        double minSalary=Double.parseDouble(scan.nextLine());

        double scolarship=0;

        if (averageSuccess>=4.50 && income < minSalary) {
                scolarship=minSalary*0.35;
                System.out.printf("You get a Social scholarship %.2f BGN",Math.floor(scolarship));
        }
        else if (averageSuccess >= 5.50) {
            scolarship=averageSuccess*25;
            System.out.printf("You get a scholarship for excellent results %.2f BGN");
        }
        else {
            System.out.println("You cannot get a scholarship!");
        }












    }
}
