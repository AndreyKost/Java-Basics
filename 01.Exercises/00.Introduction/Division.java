import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int divisible=0;
        boolean isvalid=false;

        if (n%2==0) {
            divisible=2;
            isvalid=true;
        }
        if (n%3==0) {
            divisible=3;
            isvalid=true;
        }
        if (n%6==0) {
            divisible=6;
            isvalid=true;
        }
        if (n%7==0) {
            divisible=7;
            isvalid=true;
        }
        if (n%10==0) {
            divisible=10;
            isvalid=true;
        }

        if (isvalid) {
            System.out.printf("The number is divisible by %d ",divisible);
        } else {
            System.out.println("Not divisible");
        }


    }
}
