import java.util.Scanner;

public class SkiVacation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double onePersonRoom=18.00;
        double apartment=25.00;
        double presidentRoom=35.00;
        double stay=Double.parseDouble(scan.nextLine());
        String kindOfRoom=scan.nextLine();
        String opinion=scan.nextLine();

        if (stay <10) {

            if (kindOfRoom.equals("room for one person")) {
                stay=(stay-1)*onePersonRoom;

            }else  if (kindOfRoom.equals("apartment")) {
                stay=((stay-1)*apartment) - (((stay-1)*apartment)*0.3);
            }else  if (kindOfRoom.equals("president apartment")) {
                stay=((stay-1)*presidentRoom) - (((stay-1)*presidentRoom)*0.1);
            }else
            {
                System.out.println("Erorr");
            }
        }
        else if (stay >=10 && stay <=15) {

            if (kindOfRoom.equals("room for one person")) {
                stay=(stay-1)*onePersonRoom;

            }else  if (kindOfRoom.equals("apartment")) {
                stay=((stay-1)*apartment) - (((stay-1)*apartment)*0.35);
            }else  if (kindOfRoom.equals("president apartment")) {
                stay=((stay-1)*presidentRoom) - (((stay-1)*presidentRoom)*0.15);
            }else
            {
                System.out.println("Erorr");
            }


        } else if (stay > 15) {

            if (kindOfRoom.equals("room for one person")) {
                stay=(stay-1)*onePersonRoom;

            }else  if (kindOfRoom.equals("apartment")) {
                stay=((stay-1)*apartment) - (((stay-1)*apartment)*0.5);
            }else  if (kindOfRoom.equals("president apartment")) {
                stay=((stay-1)*presidentRoom) - (((stay-1)*presidentRoom)*0.2);
            }else
            {
                System.out.println("Erorr");
            }
        }
        else {
            System.out.println("Error");
        }

        //System.out.println(stay);

        if (opinion.equals("positive")) {
            stay=stay + (stay*0.25);
            System.out.printf("%.2f",stay);
        } else if (opinion.equals("negative")){
            stay=stay - (stay*0.10);
            System.out.printf("%.2f",stay);
        }
        else {
            System.out.println("Error");
        }



    }
}
