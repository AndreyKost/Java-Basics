import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String figureType=scan.nextLine();
        double area=0;

        switch(figureType){
            case "square": {
                double a=Double.parseDouble(scan.nextLine());
                area=a*a;
                System.out.printf("%.3f",area);
                break;
            }
            case "rectangle": {
                double a=Double.parseDouble(scan.nextLine());
                double b=Double.parseDouble(scan.nextLine());
                area=a*b;
                System.out.printf("%.3f",area);
                break;
            }
            case "circle": {
                double r=Double.parseDouble(scan.nextLine());
                double R=2*r;
                area= 2*Math.PI*R;
                System.out.printf("%.3f",area);
                break;
            }
            case "triangle": {
                double a=Double.parseDouble(scan.nextLine());
                double ha=Double.parseDouble(scan.nextLine());
                area=(a*ha)/2;
                System.out.printf("%.3f",area);
                break;
            }



        }



    }
}
