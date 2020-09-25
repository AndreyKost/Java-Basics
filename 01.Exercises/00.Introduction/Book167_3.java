import java.util.Scanner;

public class Book167_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        if (a>b && a>c){
            System.out.println(a);
        }else if (b>a && b>c) {
            System.out.println(b);
        } else if (c>a && c>b) {
            System.out.println(c);
        }else if (a ==b && a!=c) {
            System.out.printf("%na=b=%d",a);
        }else if (a ==c && a!=b) {
            System.out.printf("%na=c=%d",a);
        }else if(b==c && b!=a){
            System.out.printf("%nb=c=%d",b);
        }




    }
}
