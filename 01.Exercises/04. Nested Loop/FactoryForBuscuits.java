import java.util.Scanner;

public class FactoryForBuscuits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        boolean eggs=false;
        boolean flour=false;
        boolean sugar=false ;

        for (int i = 1; i <=n; i++) {
            String product="";


            while ((!eggs|| !flour || !sugar) || !product.equalsIgnoreCase("Bake!")){
                product=scanner.nextLine();
                if (product.equalsIgnoreCase("eggs")) {
                    eggs=true;
                } else if (product.equalsIgnoreCase("flour")) {
                    flour=true;
                } else if (product.equalsIgnoreCase("sugar")) {
                    sugar=true;
                } else if (product.equalsIgnoreCase("Bake!")) {
                    if (eggs && flour && sugar) {
                        System.out.printf("Baking batch number%d...%n", i);
                        eggs=false;
                        flour=false;
                        sugar=false;
                        break;
                    } else {
                        System.out.printf("The batter should contain flour, eggs and sugar!%n");

                    }
                }

            }



        }



    }
}
