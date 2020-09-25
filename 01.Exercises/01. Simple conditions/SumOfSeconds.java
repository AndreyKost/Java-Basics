import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int timeFirst=Integer.parseInt(scan.nextLine());
            int timeSecond= Integer.parseInt(scan.nextLine());
            int timeThird= Integer.parseInt(scan.nextLine());

            int totalTime=timeFirst+timeSecond+timeThird;
            int minutes=totalTime /60;
            int seconds=totalTime %60;

        if (seconds < 10 ) {
            System.out.printf("%d: 0%d",minutes,seconds);
        }
        else {
            System.out.printf("%d:%d",minutes,seconds);
        }

        //Печатането на резултата с водеща нула може да се осъществи и чрез шаблона %02d,
        // чрез който можем да покажем, че искаме нашето цяло число (секундите) да се състои от две цифри:
        //System.out.printf("%d:%02d",minutes,seconds);
    }
}
