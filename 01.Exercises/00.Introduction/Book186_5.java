import java.util.Scanner;

public class Book186_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        int sum;

        int first=-1;
        int second=1;

        for (int i = 0; i <N ; i++) {
            int third=first+second;
            System.out.println(third);
            first=second;
            second=third;
        }



    }
}
