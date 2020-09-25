import java.util.Scanner;

public class Book186_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //пресмята N!/K! за дадени N и K (1<K<N)
        int N=Integer.parseInt(scanner.nextLine());
        int K=Integer.parseInt(scanner.nextLine());

        int result=1;

        for (int i = K+1; i <=N; i++) {
            result*=i;
        }

        System.out.println( result);


    }
}
