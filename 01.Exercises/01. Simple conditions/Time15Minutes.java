import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int startHours=Integer.parseInt(scan.nextLine());
        int startMinutes=Integer.parseInt(scan.nextLine());

        int timeInMinutes=startHours*60+startMinutes;
        int timePlus15=timeInMinutes+15;

        int finalHours=timePlus15/60;
        int finalMinutes=timePlus15%60;

        if (finalHours >= 24) {
            finalHours=finalHours-24;
        }
        if (finalMinutes < 10) {
            System.out.printf("%d:0%d",finalHours,finalMinutes);
        }
        else {
            System.out.printf("%d:%d",finalHours,finalMinutes);
        }




    }
}
