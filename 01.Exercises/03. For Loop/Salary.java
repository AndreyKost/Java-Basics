import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int salary=Integer.parseInt(scanner.nextLine());
        int leftSalary=0;


        for (int i = 0; i <n ; i++) {
            String site=scanner.nextLine();

            if (site.equals("Facebook")) {
                leftSalary+=150;
            }
            if(site.equals("Instagram")) {
                leftSalary+=100;
            }
            if(site.equals("Reddit")) {
                leftSalary+=50;
            }
            if (salary-leftSalary<=0) {
                System.out.println("You have lost your salary");
                break;
            }

        }

        if (salary-leftSalary>0) {
            System.out.printf("%d", salary-leftSalary);
        }


    }
}
