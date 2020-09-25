import java.util.Scanner;

public class BackIn30Mins {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int mins=Integer.parseInt(scanner.nextLine());

        int hoursInMins=hours*60;
        int allSum=hoursInMins+mins+30;
        if (allSum>=1440) {
            allSum-=1440;
        }
        int hoursFinal=allSum/60;
        int minsFinal=allSum%60;

        System.out.printf("%d:%02d",hoursFinal,minsFinal);




    }
}
