import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int width=Integer.parseInt(scan.nextLine());
        int length=Integer.parseInt(scan.nextLine());
        int numOfpieces=width*length;
        int totalPieces=0;
        String input=scan.nextLine();

        while (totalPieces<numOfpieces && !"STOP".equals(input)){
            int in=Integer.parseInt(input);
            totalPieces+=in;

            if (totalPieces >=numOfpieces) {
                if (totalPieces==numOfpieces) {
                    System.out.printf("No more cake left!");
                    break;
                } else {
                    System.out.printf("No more cake left! You need %d pieces more.",totalPieces-numOfpieces);
                    break;
                }
            }
            input=scan.nextLine();
        }

        if (input.equals("STOP")) {
            System.out.printf("%d pices are left.",numOfpieces-totalPieces);
        }


    }
}
