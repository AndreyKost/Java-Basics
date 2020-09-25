import java.util.Scanner;

public class Num1to100 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=Integer.parseInt(scan.nextLine());

        while (number <1 || number>100){
            System.out.println("Error, please insert number between 1 and 100");
            number=Integer.parseInt(scan.nextLine());
        }
        System.out.println(number);




    }
}
