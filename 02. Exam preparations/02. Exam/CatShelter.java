import java.util.Scanner;

public class CatShelter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int quantityFoodKg=Integer.parseInt(scanner.nextLine());
        int sum=0;
        int x=quantityFoodKg*1000;

        String command=scanner.nextLine();

        while (!command.equalsIgnoreCase("Adopted")){
            int num=Integer.parseInt(command);

            sum+=num;

            command=scanner.nextLine();
        }

        if (x>=sum) {
            System.out.printf("Food is enough! Leftovers: %d grams.",x-sum);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.",sum-x);
        }






    }
}
