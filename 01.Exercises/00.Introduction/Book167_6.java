import java.sql.SQLOutput;
import java.util.Scanner;

public class Book167_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        int d=Integer.parseInt(scanner.nextLine());
        int e=Integer.parseInt(scanner.nextLine());

        int max1=Math.max(a,b);
        int max2=Math.max(c,d);
        int max3=Math.max(max1,max2);
        int max4=Math.max(max3,e);

        System.out.printf("%n The biggest number is %d",max4);


    }
}
