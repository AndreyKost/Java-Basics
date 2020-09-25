
import java.util.Scanner;

public class Book167_8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int points= Integer.parseInt(scanner.nextLine());
        int bonusPoints=0;

        if (points<1 || points>9) {
            System.out.println("Wrong input");
        }else
        if (points <=3) {
            bonusPoints=points*10;
            System.out.printf("%n The points are %d",bonusPoints);
        }else if (points<=6) {
            bonusPoints=points*100;
            System.out.printf("%n The points are %d",bonusPoints);
        }else if(points<=9){
            bonusPoints=points*1000;
            System.out.printf("%n The points are %d",bonusPoints);
        }





    }
}
