import java.util.Scanner;

public class KidsToys {
    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         double puzzlePrice=2.60;
         double speakingDollPrice=3.0;
         double bearPrice=4.10;
         double minionPrice=8.20;
         double truckPrice=2.0;

         double tripPrice=Double.parseDouble(scan.nextLine());
         double puzzleNumbers=Double.parseDouble(scan.nextLine());
         double speakingDollNumbers=Double.parseDouble(scan.nextLine());
         double bearNumbers=Double.parseDouble(scan.nextLine());
         double minionNumbers=Double.parseDouble(scan.nextLine());
         double truckNumbers=Double.parseDouble(scan.nextLine());

         double allToys=puzzleNumbers+speakingDollNumbers+bearNumbers+minionNumbers+truckNumbers;
         double allProfit=puzzleNumbers*puzzlePrice + speakingDollNumbers*speakingDollPrice+bearNumbers*bearPrice+minionNumbers*minionPrice+truckNumbers*truckPrice;
         double leftMoney;

         if (allToys>=50){
             allProfit=allProfit -(0.25*allProfit);
             allProfit=allProfit - (0.10*allProfit);
             if (allProfit>=tripPrice){
                 leftMoney=allProfit-tripPrice;
                 System.out.println("Yes !"+leftMoney + " lv left");
             }
             else {
                 leftMoney=allProfit - tripPrice;
                 System.out.println("Not enough money!"+Math.abs(leftMoney)+ "lv needed");
             }
         }
         else {
             allProfit=allProfit - (0.10*allProfit);
             if (allProfit>=tripPrice){
                 leftMoney=allProfit-tripPrice;
                 System.out.println("Yes !"+leftMoney + " lv left");
             }
             else {
                 leftMoney=allProfit - tripPrice;
                 System.out.println("Not enough money!"+Math.abs(leftMoney)+ "lv needed");
             }
         }





    }
}
