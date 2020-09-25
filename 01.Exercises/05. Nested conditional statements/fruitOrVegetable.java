import java.util.Scanner;

public class fruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String fruitOrveg=scan.nextLine();

        if (fruitOrveg.equals("banana") || fruitOrveg.equals("apple") || fruitOrveg.equals("kiwi") || fruitOrveg.equals("cherry") ||
                fruitOrveg.equals("lemon") || fruitOrveg.equals("grapes")) {
            System.out.println("fruit");
        }
        else if (fruitOrveg.equals("tomato") || fruitOrveg.equals("cucumber") || fruitOrveg.equals("pepper") || fruitOrveg.equals("carrot")) {
            System.out.println("vegetable");
        }
        else {
            System.out.println("unknown");
        }






    }
}
