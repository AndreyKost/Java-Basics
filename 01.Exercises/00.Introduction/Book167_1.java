import java.util.Scanner;

public class Book167_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int swap;

        if (a>b) {
            swap=b;
            b=a;
            a=swap;

        }else if(a<b){
            swap=b;
            b=a;
            a=swap;
        }
        else {
            System.out.println("a=b");
        }

        System.out.println("a="+a);
        System.out.println("b="+b);





    }
}
