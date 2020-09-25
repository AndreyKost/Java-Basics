import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double sum=Double.parseDouble(scanner.nextLine());
        int numOfStudents=Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber=Double.parseDouble(scanner.nextLine());
        double priceOfRobe=Double.parseDouble(scanner.nextLine());
        double priceOfBelt=Double.parseDouble(scanner.nextLine());
        int left=0;
        int students=numOfStudents;
        double students2=Math.ceil(numOfStudents*1.1);


        if (students>6) {
            left=students/6;
            students-=left;
        }

        double priceOfAllLightsabers=priceOfLightsaber*students2;
        double priceOfAllRobes=priceOfRobe*numOfStudents;
        double priceOfAllBelts=priceOfBelt*students;
        double allSum=priceOfAllLightsabers+priceOfAllBelts+priceOfAllRobes;


        if (sum>=allSum) {
            System.out.printf("The money is enough - it would cost %.2flv.",allSum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.",allSum-sum);
        }





    }
}
