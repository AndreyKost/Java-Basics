import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String month=scan.nextLine();
        int nightsStay=Integer.parseInt(scan.nextLine());
        double priceStudio=0;
        double priceApartment=0;
        if (month.equals("May") || month.equals("October")) {
            if (nightsStay>=7 && nightsStay<=14) {
                priceStudio=(50 -(50*0.05))*nightsStay;
            } else if (nightsStay>14) {
                priceStudio=(50 -(50*0.3))*nightsStay;
                priceApartment=(65 -(65*0.1))*nightsStay;
            } else {
                priceStudio=50*nightsStay;
                priceApartment=65*nightsStay;
            }

            System.out.printf("Apartment: %.2f lv \n",priceApartment);
            System.out.printf("Studio: %.2f lv \n",priceStudio);
        } else if (month.equals("June") || month.equals("September")) {
            if (nightsStay>14) {
                priceStudio=(75.2 -(75.2*0.2))*nightsStay;
                priceApartment=(68.7 -(68.7*0.1))*nightsStay;
            } else {
                priceStudio=75.2*nightsStay;
                priceApartment=68.7*nightsStay;
            }

            System.out.printf("Apartment: %.2f lv \n",priceApartment);
            System.out.printf("Studio: %.2f lv \n",priceStudio);
        } else if (month.equals("July") || month.equals("August")) {
            if (nightsStay>14) {
                priceApartment=(77 -(77*0.1))*nightsStay;
                priceStudio=76*nightsStay;
            } else {
                priceStudio=76*nightsStay;
                priceApartment=77*nightsStay;
            }

            System.out.printf("Apartment: %.2f lv \n",priceApartment);
            System.out.printf("Studio: %.2f lv \n",priceStudio);

        }


    }
}
