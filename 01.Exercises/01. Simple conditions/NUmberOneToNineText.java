import java.util.Scanner;

public class NUmberOneToNineText {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int unmber1=Integer.parseInt(scan.nextLine());

        if (unmber1 == 1) {
            System.out.println("one");
        }
        else if (unmber1 == 2) {
            System.out.println("two");
        }
        else if (unmber1 == 3) {
            System.out.println("Three");
        }
        else if (unmber1 == 4) {
            System.out.println("Four");
        }
        else if (unmber1 == 5) {
            System.out.println("five");
        }
        else if (unmber1 == 6) {
            System.out.println("Six");
        }
        else if (unmber1 == 7) {
            System.out.println("seven");
        }
        else if (unmber1 == 8) {
            System.out.println("eight");
        }
        else if (unmber1 == 9) {
            System.out.println("one");
        }
        else {
            System.out.println("The number is not between 1 and 9 !");
        }
    }
}
