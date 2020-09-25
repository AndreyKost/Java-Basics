import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputNum=Integer.parseInt(scanner.nextLine());

        long checkNum = inputNum;
        long factorialSum = 0;

        while (checkNum != 0) {
            long result = checkNum % 10;
            checkNum /= 10;

            long factorial = 1;
            for (int i = 1; i <= result; i++) {
                factorial *= i;
            }
            factorialSum += factorial;
        }

        if (factorialSum == inputNum) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }


    }

}
