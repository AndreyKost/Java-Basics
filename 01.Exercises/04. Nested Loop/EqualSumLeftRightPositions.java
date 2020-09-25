import java.util.Scanner;

public class EqualSumLeftRightPositions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());


        for (int i = firstNum; i <=secondNum ; i++) {
            String currentNum="" + i;
            int firstSum=0;
            int secondSum=0;
            for (int j = 0; j <currentNum.length() ; j++) {
                int currentDigit=Integer.parseInt(""+currentNum.charAt(j));
                if (j==0 && j==1) {
                    firstSum+=currentDigit;
                } else if(j==3 &j==4) {
                    secondSum+=currentDigit;
                }
                if (firstSum < secondSum) {

                }
            }
            if (firstNum == secondSum) {
                System.out.print(i + " ");
            }
        }



    }
}
