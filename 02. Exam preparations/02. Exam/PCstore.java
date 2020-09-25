import java.util.Scanner;

public class PCstore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double usdProcessor=Double.parseDouble(scanner.nextLine());
        double usdVideoCard=Double.parseDouble(scanner.nextLine());
        double usdRAM=Double.parseDouble(scanner.nextLine());
        int numOfRAM=Integer.parseInt(scanner.nextLine());
        double discount=Double.parseDouble(scanner.nextLine());

        double sumProcessor=usdProcessor-(usdProcessor*discount);
        double sumVideoCard=usdVideoCard-(usdVideoCard*discount);
        double sumOfRam=(numOfRAM*1.0)*usdRAM;

        double bgnAllSum=(sumProcessor+sumVideoCard+sumOfRam)*1.57;

        System.out.printf("Money needed - %.2f leva.",bgnAllSum);


    }
}
