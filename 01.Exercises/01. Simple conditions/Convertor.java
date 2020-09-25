import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double  num=Double.parseDouble(scan.nextLine());
        String inputSize=scan.nextLine();
        String  outputSize=scan.nextLine();





        if (inputSize.equals("m") ) {
            if (outputSize.equals("cm")) {
             num=num*100;
            }
            else {
                num=num*1000;
            }
        }
        if ( inputSize.equals("cm")) {
             if (outputSize.equals("m")){
                 num=num/100;
             }else {
                 num = num * 10;
             }
        }
          if(inputSize.equals("mm")) {
            if (outputSize.equals("cm")) {
                num=num/10;
            }else{
                num=num/1000;
            }

        }


          System.out.printf("%.3f",num);


    }
}
