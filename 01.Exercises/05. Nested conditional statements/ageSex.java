import java.util.Scanner;

public class ageSex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double age=Double.parseDouble(scan.nextLine());
        String sex=scan.nextLine();

        if (sex.equals("m")) {
            if (age>=16) {
                System.out.printf("Mr.");
            }
            else {
                System.out.printf("Master");
            }

        }
        else if (sex.equals("f")) {
            if (age>=16 ) {
                System.out.printf("Ms.");
            }
            else {
                System.out.printf("Miss");
            }

        }
        else {
            System.out.printf("Uknown gender ! Please put m or f ");
        }





    }
}
