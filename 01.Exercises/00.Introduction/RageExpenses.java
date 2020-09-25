import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lostGames=Integer.parseInt(scanner.nextLine());
        double priceOfHeadset=Double.parseDouble(scanner.nextLine());
        double priceOfMouse=Double.parseDouble(scanner.nextLine());
        double priceOfKeybord=Double.parseDouble(scanner.nextLine());
        double priceOfDisplay=Double.parseDouble(scanner.nextLine());
        double sum=0;
        int count=1;

        for (int i = 1; i <=lostGames ; i++) {
            if (i%2==0) {
                sum+=priceOfHeadset;
            }
            if (i%3==0) {
                sum+=priceOfMouse;
            }
            if (i%6==0) {
                sum+=priceOfKeybord;
                ;
            }
            if (i%12==0) {
                sum+=priceOfDisplay;
            }


        }


        System.out.printf("Rage expenses: %.2f lv.",sum);


    }
}
