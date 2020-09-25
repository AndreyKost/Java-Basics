import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double moneyForTrip=Double.parseDouble(scan.nextLine());
        double moneyLeft=Double.parseDouble(scan.nextLine());
        int count=0;
        int count2=0;
        boolean isEnough=false;

        while(count<5 && moneyLeft<moneyForTrip){
            String action=scan.nextLine();
            double moneyTransfer=Double.parseDouble(scan.nextLine());
            count2++;
            if (action.equals("spend")) {
                moneyLeft-=moneyTransfer;
                if (moneyLeft <0) {
                    moneyLeft=0;
                }
                count++;
            } else {
                moneyLeft+=moneyTransfer;
            }

            if (moneyLeft>=moneyForTrip) {
                isEnough=true;
                break;
            }

        }

        if (isEnough) {
            System.out.printf("You saved the money for %d days.",count2);
        } else {
            System.out.printf("You can't save the money. %n5");
        }



    }
}
