import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String studentName=scan.nextLine();
        double totalGrades=0;
        int classCount=1;
        int expelCount=0;
        boolean isExpelled=false;

        while(classCount<=12) {
            double  grade=Double.parseDouble(scan.nextLine());

            if (grade>=4.00) {
                classCount++;
                totalGrades+=grade;

            } else {
                expelCount++;
            }

            if (expelCount==2) {
                isExpelled=true;
                break;
            }

        }
        if (isExpelled) {
            System.out.printf("%s has benn excluded at %d grade",studentName,classCount);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, totalGrades / 12);
        }




    }
}
