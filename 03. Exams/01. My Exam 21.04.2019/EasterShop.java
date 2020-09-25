import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNumOfEggs=Integer.parseInt(scanner.nextLine());
        String command=scanner.nextLine();
        int soldEggs=0;
        boolean isEnough=false;

        while(!command.equalsIgnoreCase("Close")){
            int number=Integer.parseInt(scanner.nextLine());

            if (command.equalsIgnoreCase("Buy")) {
                if (number>firstNumOfEggs) {
                    //System.out.printf("Not enough eggs in store!%n");
                    //System.out.printf("You can buy only %d.",firstNumOfEggs);
                    soldEggs+=firstNumOfEggs;
                    isEnough=true;
                    break;

                }
                if (firstNumOfEggs>=number) {
                    firstNumOfEggs-=number;
                    soldEggs+=number;
                }
            }
            if (command.equalsIgnoreCase("Fill")) {
                firstNumOfEggs+=number;
            }


            command=scanner.nextLine();
        }

        if (isEnough) {
            System.out.printf("Not enough eggs in store!%n");
            System.out.printf("You can buy only %d.",firstNumOfEggs);
        } else {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.",soldEggs);
        }


    }
}
