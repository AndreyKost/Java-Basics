import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);

            int number= Integer.parseInt(scan.nextLine());

        if (number%2==0) {
            System.out.println("Chetno");
        }
        else{
            System.out.println("Nechetno");
        }
    }
}
