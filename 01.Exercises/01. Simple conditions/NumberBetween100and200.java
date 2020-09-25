import java.util.Scanner;

public class NumberBetween100and200 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=Integer.parseInt(scan.nextLine());

        if (num1 >= 100  && num1 <=200) {
            System.out.println("Between 100 and 200");
        }
        else if (num1 <100) {
            System.out.println("Under 100");
        }
        else if (num1 >200) {
            System.out.println("over 200");
        }



    }
}
