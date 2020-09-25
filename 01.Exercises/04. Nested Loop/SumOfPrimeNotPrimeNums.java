import java.util.Scanner;

public class SumOfPrimeNotPrimeNums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String command=scanner.nextLine();
        int sumPrime=0;
        int sumNonprime=0;


        while (!"stop".equals(command)){
            int num=Integer.parseInt(command);
            if (num <0) {
                System.out.println("Number is negative");
                continue;

            }

           boolean isPrime=true;
            if (num == 1) {
                isPrime=false;
            } else {
                for (int i = num; i>=2 ; i--) {
                    if (num %i==0 && i!=num) {
                        isPrime=false;

                    }

                }
            }

            if ( isPrime) {
                sumPrime+=num;
            } else {
                sumNonprime+=num;
            }
        }


        System.out.printf("Sum of all prime number is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonprime);

    }
}
