import java.util.Scanner;

public class TheOldLibrary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String favouriteBook=scan.nextLine();
        int capacity=Integer.parseInt(scan.nextLine());
        String currentbook="";
        int count=0;
        boolean isFound=false;

        while (!isFound && capacity>count){
            currentbook=scan.nextLine();
            if (currentbook.equals(favouriteBook)) {
                isFound=true;
            } else {
                count++;
            }
        }


        if (isFound) {
            System.out.printf("You checked %d books and found it.",count);
        } else {
            System.out.printf("The book you searchis not here!%nYou checked %d books",count);
        }






    }
}
