import java.util.Scanner;

public class districtMarket {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String product=scan.nextLine();
        String town=scan.nextLine();
        double quantity=Double.parseDouble(scan.nextLine());
        double price=0;

        if (town.toLowerCase().equals("sofia")) {
            if (product.toLowerCase().equals("coffee")) {
                      price=0.5;
            }
            else if (product.toLowerCase().equals("water")) {
                price=0.8;
            }
            else if (product.toLowerCase().equals("beer")) {
                price=1.20;
            }else  if (product.toLowerCase().equals("sweets")) {
                price=1.45;
            }
            else  if (product.toLowerCase().equals("peanuts")) {
                price=1.60;
            }

        }
        else if (town.toLowerCase().equals("plovdiv")) {
            if (product.toLowerCase().equals("coffee")) {
                price=0.4;
            }
            else if (product.toLowerCase().equals("water")) {
                price=0.7;
            }
            else if (product.toLowerCase().equals("beer")) {
                price=1.15;
            }else  if (product.toLowerCase().equals("sweets")) {
                price=1.30;
            }
            else  if (product.toLowerCase().equals("peanuts")) {
                price=1.50;
            }
        }
        else if(town.toLowerCase().equals("varna")){
            if (product.toLowerCase().equals("coffee")) {
                price=0.45;
            }
            else if (product.toLowerCase().equals("water")) {
                price=0.7;
            }
            else if (product.toLowerCase().equals("beer")) {
                price=1.10;
            }else  if (product.toLowerCase().equals("sweets")) {
                price=1.35;
            }
            else  if (product.toLowerCase().equals("peanuts")) {
                price=1.55;
            }
        }
        else {
            System.out.println("please choose sofia,plovdiv or varna for towns");
        }

        double result=price*quantity;
        System.out.printf("%.2f",result);



    }
}
