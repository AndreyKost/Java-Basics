import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int insert=0;
        int max=Integer.MIN_VALUE;
        while(insert<n){
            int number=Integer.parseInt(scan.nextLine());
            if (number>max) {
                max=number;
            }

           insert++;
        }
        System.out.println(max);


    }
}
