import java.util.Scanner;

public class InTimeForExam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int hourOfExam=Integer.parseInt(scan.nextLine());
        int minOfExam=Integer.parseInt(scan.nextLine());
        int hourOfArrival=Integer.parseInt(scan.nextLine());
        int minOfArrival=Integer.parseInt(scan.nextLine());
        int hourOfExamInMin=hourOfExam*60;
        int hourOfArrivalInMin=hourOfArrival*60;

        int time1=hourOfExamInMin+minOfExam;
        int time2=hourOfArrivalInMin+minOfArrival;
        int result=0;
        int sum1=0;
        int sum2=0;

        if (time1>time2) {
             result=time1-time2;
            if ( result<=30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start",result);
            } else if (result > 30 && result<60) {
                System.out.println("Early");
                System.out.printf("%d minutes before the start",result);
            } else if (result>=60 && result%60==0) {
                System.out.println("Early");
                sum1=result/60;
                System.out.printf("%d:00 hours before the start",sum1);
            } else if (result>=60 && result%60!=0) {
                sum1=result/60;
                sum2=result%60;
                if (sum2 <10) {
                    System.out.println("Early");
                    System.out.printf("%d:0%d hours before the start",sum1,sum2);
                } else {
                    System.out.println("Early");
                    System.out.printf("%d:%d hours before the start", sum1, sum2);
                }
            }

        } else if (time1==time2) {
            System.out.println("On time");
        } else if (time2>time1) {
            result=time2-time1;
            if ( result<60) {
                System.out.println("Late");
                System.out.printf("%d minutes after the start",result);
            } else if (result>=60 && result%60==0) {
                sum1=result/60;
                sum2=result%60;
                System.out.println("Late");
                System.out.printf("%d:00 hours after the start",sum1);
            } else if (result>=60 && result%60!=0) {
                sum1=result/60;
                sum2=result%60;
                if(sum2<10) {
                    System.out.println("Late");
                    System.out.printf("%d:0%d hours after the start", sum1, sum2);
                }
                else{
                    System.out.println("Late");
                    System.out.printf("%d:%d hours after the start", sum1, sum2);
                }
                }
            }

        }



    }

