import java.util.Scanner;

public class GuessThePassword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String password=scan.nextLine();

        if (password.equals("a59jenere")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password");
        }

    }
}
