import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        double allSum=0;


        for (int i = 1; i <=n ; i++) {
            int count=0;
            double sum=0;
            String command=scanner.nextLine();

            while (!command.equalsIgnoreCase("Finish")){
                if (command.equalsIgnoreCase("basket")) {
                    count++;
                    sum+=1.50;
                } else if (command.equalsIgnoreCase("wreath")) {
                    count++;
                    sum+=3.80;
                } else if (command.equalsIgnoreCase("chocolate bunny")) {
                    count++;
                    sum+=7;
                }

                command=scanner.nextLine();

            }

            if (count%2==0) {
                sum=sum-(sum*0.20);
            }
            allSum+=sum;
            System.out.printf("You purchased %d items for %.2f leva.%n",count,sum);

        }




        System.out.printf("Average bill per client is: %.2f leva.",allSum/n);

    }
}
