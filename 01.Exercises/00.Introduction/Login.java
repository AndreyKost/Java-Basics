import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();

        StringBuilder input1 = new StringBuilder();
        input1.append(password);
        int failAttempts=0;
        boolean isValid=false;
        StringBuilder a=input1.reverse();

        while(failAttempts!=4){
            String pass=scanner.nextLine();

            if (pass.contentEquals(a)){
                System.out.printf("User %s logged in.",password);
                break;
            } else {
                failAttempts++;
                if (failAttempts ==4) {
                    break;
                }
                System.out.printf("Incorrect password. Try again.%n");
            }

        }

        if (failAttempts ==4) {
            System.out.printf("User %s blocked!", password);
        }

    }
}
