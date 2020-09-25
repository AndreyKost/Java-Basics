import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isValid=true;

        while (isValid){
            int n=Integer.parseInt(sc.nextLine());
            if (n%2==0) {
                System.out.println("The number is: "+Math.abs(n));
                isValid=false;
            } else {
                System.out.println("Please write an even number. ");
                isValid=true;
            }

        }


    }
}
