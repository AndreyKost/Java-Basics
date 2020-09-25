import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int red=0;
        int orange=0;
        int blue=0;
        int green=0;
        String colour=null;
        int max=Integer.MIN_VALUE;


        for (int i = 0; i <n ; i++) {
            String colourOfEgg=scanner.nextLine();
            if (colourOfEgg.equalsIgnoreCase("red")) {
                ++red;
                if (red>max) {
                    max=red;
                    colour=colourOfEgg;
                }
            } else if (colourOfEgg.equalsIgnoreCase("orange")) {
                ++orange;
                if (orange>max) {
                    max=orange;
                    colour=colourOfEgg;
                }
            } else if (colourOfEgg.equalsIgnoreCase("blue")) {
                ++blue;
                if (blue>max) {
                    max=blue;
                    colour=colourOfEgg;
                }
            } else if (colourOfEgg.equalsIgnoreCase("green")) {
                ++green;
                if (green>max) {
                    max=green;
                    colour=colourOfEgg;
                }
            }


        }

        System.out.printf("Red eggs: %d%n",red);
        System.out.printf("Orange eggs: %d%n",orange);
        System.out.printf("Blue eggs: %d%n",blue);
        System.out.printf("Green eggs: %d%n",green);
        System.out.printf("Max eggs: %d -> %s",max,colour);



    }
}
