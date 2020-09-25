import java.util.Scanner;

public class Book186_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());

        for(int i=1;i<=N;i++){
            if(i%3!=0 && i%7!=0){
                System.out.println(i);
            }


        }




    }
}
