import java.util.Scanner;

public class GamingStore2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double balance=Double.parseDouble(scanner.nextLine());
        String input=scanner.nextLine();
        double price=0;
        double totalSpend=0.0;
        boolean isValid=true;
        boolean fg1=true;


        while (!input.equalsIgnoreCase("Game Time")) {

            switch (input) {
                case "OutFall 4":
                    price = 39.99;
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    fg1=false;
                    break;
            }

            if (balance>price ) {
                balance-=price;
                totalSpend+=price;
                System.out.printf("Bought %s%n",input);
            } else if (balance == price) {
                balance-=price;
                totalSpend+=price;
                System.out.printf("Bought %s%n",input);
                System.out.printf("Out of money! %n");
                isValid=false;
                break;
            }else {
                System.out.println("Too Expensive");
            }
            input=scanner.nextLine();
        }
        if (isValid) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend,balance);
        }
    }
}
