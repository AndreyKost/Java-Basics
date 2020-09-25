import java.util.Scanner;

public class Book186_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        int max=Integer.MIN_VALUE;


        for (int i = 0; i <n ; i++) {
            int b=Integer.parseInt(scanner.nextLine());
            if (b>=max) {
                max=b;
            }

        }

        System.out.println(max);






    }
}
