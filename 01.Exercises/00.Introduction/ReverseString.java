import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        StringBuilder input=new StringBuilder();
        input.append(word);

        System.out.println(input.reverse());




    }
}
