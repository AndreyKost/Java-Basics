import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int m;



        if(n<10){
            m=n;
        }else{
            m=n%10;
        }

        String number;
        switch (m){
            case 0:
                number="zero";
                break;
            case 1:
                number="one";
                break;
            case 2:
                number="two";
                break;
            case 3:
                number="three";
                break;
            case 4:
                number="four";
                break;
            case 5:
                number="five";
                break;
            case 6:
                number="six";
                break;
            case 7:
                number="seven";
                break;
            case 8:
                number="eight";
                break;
            case 9:
                number="nine";
                break;
                default:
                    number="wrong number";
        }

        System.out.println(number);


    }
}
