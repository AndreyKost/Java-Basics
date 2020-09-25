import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String result=scanner.nextLine();
        String in="";
        for(int i=result.length()-1; i>=0; i--) {
            in +=result.charAt(i);
        }
        System.out.println(in);



    }
}
