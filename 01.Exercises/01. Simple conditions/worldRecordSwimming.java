import java.util.Scanner;

public class worldRecordSwimming {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double recordInSeconds=Double.parseDouble(scan.nextLine());
        double distanceInMeters=Double.parseDouble(scan.nextLine());
        double timeInSecFor1Meter=Double.parseDouble(scan.nextLine());

        double distanceForSwim=distanceInMeters*timeInSecFor1Meter;

        double waterResistance=(distanceInMeters/15)*12.5;
        double timeIvan=distanceForSwim+Math.floor(waterResistance);
        //double timeIvan=distanceForSwim+waterResistance;
        double difference=0;
        if (timeIvan <recordInSeconds) {
            System.out.printf("Yes, he succeded! The new world record is %.2f",timeIvan);
        }
        else{
            difference=recordInSeconds-timeIvan;
            System.out.printf("No, he failed! He was %.2f seconds slower",Math.abs(difference));
        }




    }
}
