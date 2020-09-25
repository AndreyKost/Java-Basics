import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num=Double.parseDouble(scan.nextLine());

        DecimalFormat df=new DecimalFormat("#.##");

        double coins=Double.parseDouble(df.format(num*100));
        int count=0;

        while (coins>=0){
            if (coins>=200) {
                coins-=200;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=100) {
                coins-=100;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=50) {
                coins-=50;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=20) {
                coins-=20;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=10) {
                coins-=10;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=5) {
                coins-=5;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=2) {
                coins-=2;
                count++;
                if (coins == 0) {
                    break;
                }
            } else if (coins>=1) {
                coins-=1;
                count++;
                if (coins == 0) {
                    break;
                }
            }

        }

        System.out.println(count);

    }
}
