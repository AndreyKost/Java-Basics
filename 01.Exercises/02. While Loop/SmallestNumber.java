import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int count=0;
        int min=Integer.MAX_VALUE;

        while (count<n){
            int number=Integer.parseInt(scan.nextLine());
            if (number<min) {
                min=number;
            }


            count++;
        }

        System.out.println(min);


    }
}
