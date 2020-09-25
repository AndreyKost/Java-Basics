import java.util.Scanner;

public class SmartLili {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age=Integer.parseInt(scan.nextLine());
        double priceOfWash=Double.parseDouble(scan.nextLine());
        int priceOfToy=Integer.parseInt(scan.nextLine());
        int sumOfToys=0;
        int sumOfMoney=0;
        int gift=10;


        for (int i = 1; i <=age ; i++) {
            if (i%2==0) {
                sumOfMoney+=(gift-1);
                gift+=10;
            } else {
                sumOfToys+=priceOfToy;
            }
        }

        double sum1=sumOfToys+sumOfMoney;
        double sum2=sum1-priceOfWash;

        if((sumOfToys+sumOfMoney)>=priceOfWash){
            System.out.printf("Yes! %.2f",sum2);
        } else {
            System.out.printf("No! %.2f",Math.abs(sum2));
        }

    }
}
