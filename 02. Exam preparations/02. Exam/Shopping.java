import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int numOfChocolates=Integer.parseInt(scanner.nextLine());
        double litersMilk=Double.parseDouble(scanner.nextLine());

        double sumOfChocolates=(numOfChocolates*1.0)*0.65;
        double sumOfMilk=litersMilk*2.70;
        double numOfMandarins=Math.floor(numOfChocolates-(numOfChocolates*0.35));

        double sumOfMandarins=numOfMandarins*0.20;

        double allSum=sumOfChocolates+sumOfMandarins+sumOfMilk;


        if (budget>=allSum) {
            System.out.printf("You got this, %.2f money left!",budget-allSum);
        } else {
            System.out.printf("Not enough money, you need %.2f more!",allSum-budget);
        }





    }
}
