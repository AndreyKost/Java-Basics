import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        String typeOfGroup=scanner.nextLine();
        String dayOfTheWeek=scanner.nextLine();
        double price=0.0;
        double sum=0.0;


        if (dayOfTheWeek.equalsIgnoreCase("Friday")) {
            if (typeOfGroup.equalsIgnoreCase("Students")) {
                price=8.45;
            } else if (typeOfGroup.equalsIgnoreCase("Business")) {
                price=10.90;
            } else if (typeOfGroup.equalsIgnoreCase("Regular")) {
                price=15;
            }

        } else if (dayOfTheWeek.equalsIgnoreCase("Saturday")) {
            if (typeOfGroup.equalsIgnoreCase("Students")) {
                price=9.80;
            } else if (typeOfGroup.equalsIgnoreCase("Business")) {
                price=15.60;
            } else if (typeOfGroup.equalsIgnoreCase("Regular")) {
                price=20;
            }
        } else if (dayOfTheWeek.equalsIgnoreCase("Sunday")) {
            if (typeOfGroup.equalsIgnoreCase("Students")) {
                price=10.46;
            } else if (typeOfGroup.equalsIgnoreCase("Business")) {
                price=16;
            } else if (typeOfGroup.equalsIgnoreCase("Regular")) {
                price=22.50;
            }
        }


        if (typeOfGroup.equalsIgnoreCase("Students")) {
            if (num>=30 && num<100) {
                sum=(num*price)-((num*price)*0.15);
            } else {
                sum=num*price;
            }
        }
        else if (typeOfGroup.equalsIgnoreCase("Business")) {
            if (num>=100) {
                sum=(num-10)*price;
            } else {
                sum = num * price;
            }
        } else if (typeOfGroup.equalsIgnoreCase("Regular")) {
            if (num>=10 && num <=20) {
                sum=(num*price)-((num*price)*0.05);
            }
            else {
                sum=num*price;
            }
        }




        System.out.printf("Total price: %.2f",sum);




    }
}
