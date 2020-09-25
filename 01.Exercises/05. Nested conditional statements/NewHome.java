import java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double roses=5.0;
        double dahlias=3.8;
        double tulips=2.8;
        double narcissus=3;
        double gladiolus=2.5;
        String flower=scan.nextLine();
        int numOfFlowers=Integer.parseInt(scan.nextLine());
        double budget=Double.parseDouble(scan.nextLine());
        double price=0;
        double money=0;

        switch(flower){
            case "roses":
                price=numOfFlowers*roses;
                break;
            case "dahlias":
                price=numOfFlowers*dahlias;
                break;
            case "tulips":
                price=numOfFlowers*tulips;
                break;
            case "narcissus":
                price=numOfFlowers*narcissus;
                break;
            case "gladiolus":
                price=numOfFlowers*gladiolus;
                break;


        }


        if (flower.equals("roses") && numOfFlowers>80) {
            price=price -(price*0.1);
        } else  if (flower.equals("dahlias") && numOfFlowers>90) {
            price=price -(price*0.15);
        } else  if (flower.equals("tulips") && numOfFlowers>80) {
            price=price -(price*0.15);
        } else  if (flower.equals("narcissus") && numOfFlowers<120) {
            price=price +(price*0.15);
        } else  if (flower.equals("gladiolus") && numOfFlowers<80) {
            price=price +(price*0.2);
        }


        if (budget >=price ) {
            money=budget-price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left",numOfFlowers,flower,money);
        } else {
            money=price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.",money);
        }







    }
}
