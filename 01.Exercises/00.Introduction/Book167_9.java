import java.util.Scanner;

public class Book167_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String x=scanner.nextLine();
        String x1=scanner.nextLine();

        switch (x1){
            case "int":
                int i=Integer.parseInt(x)+1;
                System.out.println(i);
                break;
            case "double":
                double d=Double.parseDouble(x)+1.0;
                System.out.println(d);
                break;
            case "string":
                String s=x+"*";
                System.out.println(s);
                break;
                default:
                    System.out.println("No such a choice");;
                    break;

        }




    }
}
