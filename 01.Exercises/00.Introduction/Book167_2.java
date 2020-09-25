import java.util.Scanner;

public class Book167_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());

        if(a>0&& b>0){
            System.out.println("+");

        }else if(a<0 && b>0){
            System.out.println("-");
        } else if(a>0 && b<0){
            System.out.println("-");
        }else if(a<0 && b<0){
            System.out.println("+");
        } else if(a==0){
            System.out.println("0");
        }else if(b==0){
            System.out.println("We can't divide by zero !");
        }




    }
}
