import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int easterBread=Integer.parseInt(scanner.nextLine());
        int packetEggs=Integer.parseInt(scanner.nextLine());
        int kgCookies=Integer.parseInt(scanner.nextLine());

        double sumOfBreads=(easterBread*1.0)*3.20;
        double sumOfcookies=(kgCookies*1.0)*5.40;
        double sumPaintEggs=(packetEggs*1.0)*12*0.15;
        double sumOfEggsOnly=(packetEggs*1.0)*4.35;

        double allSum=sumOfBreads+sumOfcookies+sumPaintEggs+sumOfEggsOnly;

        System.out.printf("%.2f",allSum);



    }
}
