import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String countryName=scanner.nextLine();


        if (countryName.equalsIgnoreCase("England") || countryName.equalsIgnoreCase("USA")) {
            System.out.println("English");
        } else if(countryName.equalsIgnoreCase("Spain") || countryName.equalsIgnoreCase("Argentina")
                || countryName.equalsIgnoreCase("Mexico")){
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }


    }
}
