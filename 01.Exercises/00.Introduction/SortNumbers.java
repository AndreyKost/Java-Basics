import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());

        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;

        Arrays.sort(arr);
        /*for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }*/

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }







    }
}
