import java.util.Scanner;

public class MagicNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <=9 ; a++) {
            for (int b = 1; b <=9 ; b++) {
                for (int i = 1; i <=9 ; i++) {
                    for (int j = 1; j <=9 ; j++) {
                        for (int k = 0; k <=9 ; k++) {
                            for (int v = 0; v <=9 ; v++) {
                                int sum=a*b*i*j*k*v;
                                if (sum == num) {
                                    System.out.printf("%d%d%d%d%d%d%n",a,b,i,j,k,v);
                                }
                            }
                        }
                    }
                }
            }
        }




    }
}
