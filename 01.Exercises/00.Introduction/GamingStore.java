import java.sql.SQLOutput;
import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance=Double.parseDouble(scanner.nextLine());
        String input=scanner.nextLine();
        double sum=0.0;
        boolean isValid=false;

        while(!input.equalsIgnoreCase("Game Time")){

            if (input.equalsIgnoreCase("OutFall 4")) {
                if (balance-39.99==0) {
                    balance-=39.99;
                    sum+=39.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-39.99<0) {
                    System.out.println("Too Expensive");
                }else {
                balance-=39.99;
                sum+=39.99;
                    System.out.printf("Bought %s%n",input);
                }
            }else if (input.equalsIgnoreCase("CS: OG")) {
                if (balance-15.99==0) {
                    balance-=15.99;
                    sum+=15.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-15.99<0) {
                    System.out.println("Too Expensive");
                }else {
                    balance-=15.99;
                    sum+=15.99;
                    System.out.printf("Bought %s%n",input);
                }
            } else if (input.equalsIgnoreCase("Zplinter Zell")) {
                if (balance-19.99==0) {
                    balance-=19.99;
                    sum+=19.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-19.99<0) {
                    System.out.println("Too Expensive");
                }else {
                    balance-=19.99;
                    sum+=19.99;
                    System.out.printf("Bought %s%n",input);
                }
            } else if (input.equalsIgnoreCase("Honored 2")) {
                if (balance-59.99==0) {
                    balance-=59.99;
                    sum+=59.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-59.99<0) {
                    System.out.println("Too Expensive");
                }else {
                    balance-=59.99;
                    sum+=59.99;
                    System.out.printf("Bought %s%n",input);
                }
            } else if (input.equalsIgnoreCase("RoverWatch")) {
                if (balance-29.99==0) {
                    balance-=29.99;
                    sum+=29.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-29.99<0) {
                    System.out.println("Too Expensive");
                }else {
                    balance-=29.99;
                    sum+=29.99;
                    System.out.printf("Bought %s%n",input);
                }
            }else if (input.equalsIgnoreCase("RoverWatch Origins Edition")) {
                if (balance-39.99==0) {
                    balance-=39.99;
                    sum+=39.99;
                    System.out.printf("Bought %s%n",input);
                    System.out.println("Out of money!");
                    isValid=true;
                    break;
                }else if (balance-39.99<0) {
                    System.out.println("Too Expensive");
                }else {
                    balance-=39.99;
                    sum+=39.99;
                    System.out.printf("Bought %s%n",input);
                }
            } else {
                System.out.println("Not Found");
            }




            input=scanner.nextLine();
        }

        if (!isValid) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",sum,balance);
        }

    }
}
