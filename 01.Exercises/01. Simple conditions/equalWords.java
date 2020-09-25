import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
/*        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The two strings are equal");
        }
        else{
            System.out.println("The two strings are not equal");
        }*/
        // moje da izpozlvame metoda equalsIgnoreCase(),koito sravnqva tekstovi stoinosti bez znachenie bukvite v tqh

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The two strings are equal");
        }
        else{
            System.out.println("The two strings are not equal");
        }

    }
}
