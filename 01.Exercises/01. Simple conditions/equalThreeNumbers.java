import java.util.Scanner;

public class equalThreeNumbers {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            int num1=Integer.parseInt(scan.nextLine());
            int num2=Integer.parseInt(scan.nextLine());
            int num3=Integer.parseInt(scan.nextLine());

        if (num1 == num2 && num1==num3){
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println("The numbers are not equal");
        }
    }
}
