import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double priceTshirt=Double.parseDouble(scanner.nextLine());
        double sumBall=Double.parseDouble(scanner.nextLine());
        double shorts=priceTshirt*0.75;
        double socks=shorts*0.20;
        double shoes=2*(priceTshirt+shorts);
        double allSum=(priceTshirt+shorts+socks+shoes)-((priceTshirt+shorts+socks+shoes)*0.15);


        if (allSum >= sumBall) {
            System.out.printf("Yes, he will earn the world-cup replica ball!%n");
            System.out.printf("His sum is %.2f lv.",allSum);
        } else
        {
            System.out.printf("No, he will not earn the world-cup replica ball.%n");
            System.out.printf("He needs %.2f lv. more.",sumBall-allSum);
        }




    }
}
