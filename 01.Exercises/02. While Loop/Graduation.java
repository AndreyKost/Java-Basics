import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String studentName=scan.nextLine();
        double totalGrades=0;
        int classCount=1;

        while(classCount<12){
            double grade=Double.parseDouble(scan.nextLine());
            if (grade >= 4.00) {
                classCount++;
                totalGrades=totalGrades+grade;
            }

        }

        System.out.printf("%s graduated. Average grade: %.2f",studentName,totalGrades/12);



    }
}
