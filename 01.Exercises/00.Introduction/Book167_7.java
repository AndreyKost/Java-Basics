import java.util.Scanner;

public class Book167_7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x1=Integer.parseInt(scanner.nextLine());
        int x2=Integer.parseInt(scanner.nextLine());
        int x3=Integer.parseInt(scanner.nextLine());
        int x4=Integer.parseInt(scanner.nextLine());
        int x5=Integer.parseInt(scanner.nextLine());

        if (x1+x2==0) {
            System.out.printf("Subset found: %d %d%n",x1,x2);
        }
        if (x1+x2+x3==0) {
            System.out.printf("Subset found: %d %d %d%n",x1,x2,x3);
        }
        if (x1+x2+x3+x4==0) {
            System.out.printf("Subset found: %d %d %d %d%n",x1,x2,x3,x4);
        }
        if (x1+x2+x3+x4+x5==0) {
            System.out.printf("Subset found: %d %d %d %d %d%n",x1,x2,x3,x4,x5);
        }

        if (x2+x1==0) {
            System.out.printf("Subset found: %d %d%n",x2,x1);
        }
        if (x2+x1+x3==0) {
            System.out.printf("Subset found: %d %d %d%n",x2,x1,x3);
        }
        if (x2+x1+x3+x4==0) {
            System.out.printf("Subset found: %d %d %d %d%n",x2,x1,x3,x4);
        }
        if (x2+x1+x3+x4+x5==0) {
            System.out.printf("Subset found: %d %d %d %d %d%n",x2,x1,x3,x4,x5);
        }




    }
}
