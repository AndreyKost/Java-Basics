import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        int c=Integer.parseInt(scanner.nextLine());
        int d=Integer.parseInt(scanner.nextLine());

        for (int firstRoFirstNum = a; firstRoFirstNum <=b ; firstRoFirstNum++) {
            for (int firstRowSecondNum = a; firstRowSecondNum <=b ; firstRowSecondNum++) {
                for (int secondRowFirstNum = c; secondRowFirstNum <=d ; secondRowFirstNum++) {
                    for (int secondRowSecondNum = c; secondRowSecondNum <=d ; secondRowSecondNum++) {
                        if ((firstRoFirstNum+secondRowSecondNum)==(firstRowSecondNum+secondRowFirstNum)&& (firstRoFirstNum!=firstRowSecondNum)
                                && (secondRowFirstNum!=secondRowSecondNum)) {

                            System.out.printf("%d%d%n",firstRoFirstNum,firstRowSecondNum);
                            System.out.printf("%d%d%n",secondRowFirstNum,secondRowSecondNum);
                            System.out.println();
                        }
                    }
                }
            }
        }






    }
}
