import java.util.Scanner;

public class SummerDress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int degreesC=Integer.parseInt(scan.nextLine());
        String partOfTheDay=scan.nextLine();
        String Outfit=null;
        String Shoes=null;

        if (partOfTheDay.equals("Morning")) {

            if (degreesC>=10 && degreesC<=18) {

                Outfit="Sweatshirt";
                Shoes="Sneakers";
            } else if (degreesC>18 && degreesC<=24) {

                Outfit="Shirt";
                Shoes="Moccasins";
            } else if (degreesC>=25) {

                Outfit="T-Shirt";
                Shoes="Sandals";
            }

        } else  if (partOfTheDay.equals("Afternoon")) {

            if (degreesC>=10 && degreesC<=18) {

                Outfit="Shirt";
                Shoes="Moccasins";
            } else if (degreesC>18 && degreesC<=24) {

                Outfit="T-Shirt";
                Shoes="Sandals";
            } else if (degreesC>24) {

                Outfit="Swimsuit";
                Shoes="Barefoot";
            }
        } else if (partOfTheDay.equals("Evening")) {

            if (degreesC>=10 && degreesC<=18) {

                Outfit="Shirt";
                Shoes="Moccasins";
            } else if (degreesC>18 && degreesC<=24) {

                Outfit="Shirt";
                Shoes="Moccasins";
            } else if (degreesC>24) {

                Outfit="Shirt";
                Shoes="Moccasins";
            }
        }

        System.out.printf("It's %d degrees , get your %s  and %s.",degreesC,Outfit,Shoes);




    }
}
