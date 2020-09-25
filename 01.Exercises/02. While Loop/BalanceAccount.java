import java.util.Scanner;

public class BalanceAccount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numOfInserts=Integer.parseInt(scan.nextLine());
        int transactions=0;
        double sum=0;

        while (transactions<numOfInserts){
            double amount=Double.parseDouble(scan.nextLine());
            if (amount <0) {
                System.out.println("Invalid operation!");
                break;
            }


            System.out.printf("Increase:%.2f%n",amount);
            sum=sum+amount;

            transactions++;
        }

        System.out.printf("Total balance: %.2f",sum);




    }
}
