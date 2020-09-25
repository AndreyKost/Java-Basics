import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int floorsCount=Integer.parseInt(scanner.nextLine());
        int roomsCount=Integer.parseInt(scanner.nextLine());


        for (int floors = floorsCount; floors >=1 ; floors--) {
            for (int rooms =0; rooms<roomsCount ; rooms++   ) {
                if (floors == floorsCount) {
                    System.out.print("L" + floors + rooms + " ");
                } else if (floors %2==0) {
                    System.out.print("O" + floors + rooms + " ");
                } else {
                    System.out.print("A" + floors + rooms + " ");
                }
            }
            System.out.println();
        }






    }
}
