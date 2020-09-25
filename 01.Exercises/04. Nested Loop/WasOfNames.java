import java.util.Scanner;

public class WasOfNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int maxCombination=Integer.MIN_VALUE;
        String winner="";

        while (!name.equalsIgnoreCase("STOP")){
            int currentSum=0;
            for (int i = 0; i <name.length() ; i++) {
                currentSum+=(int)(name.charAt(i));
            }
            if (currentSum >= maxCombination) {
                maxCombination=currentSum;
                winner=name;
            }
            name=scanner.nextLine();

        }

        System.out.printf("Winner is %s - %d",winner,maxCombination);

    }
}
