import java.util.Scanner;

public class PrepareForExam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int numOFPoorMarks=Integer.parseInt(scan.nextLine());
        String task=scan.nextLine();
        int count=0;
        int count2=0;
        double marksTotal=0;
        String lastTaskName=null;

        while(!"Enough".equals(task)){
            int marks=Integer.parseInt(scan.nextLine());
            marksTotal+=marks;
            count2++;
            lastTaskName=task;
            if (marks<=4) {
                count++;
            }
            if (count>=numOFPoorMarks) {
                break;
            }
            task=scan.nextLine();
            
        }

        if (count>=numOFPoorMarks) {
            System.out.printf("You need a break, %d poor grades",count);
        } else {
            System.out.printf("Averige score : %.2f%n Number of problems: %d%n Last problem: %s",marksTotal/count2,count2,lastTaskName);
        }


    }
}
