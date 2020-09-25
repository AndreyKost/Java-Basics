    import java.util.Scanner;

    public class VendingMachine {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            double sum=0;


            while (!input.equalsIgnoreCase("Start")) {
                double coins = Double.parseDouble(input);
                if (coins==0.1 || coins==0.2 || coins==0.5 || coins==1 || coins==2) {
                    sum+=coins;
                }
                 else {
                    System.out.printf("Cannot accept %.2f%n",coins);
                }

                 input=scanner.nextLine();
            }

            //System.out.println(sum);


            double price=0.0;
            String in=scanner.nextLine();
            while (!in.equalsIgnoreCase("End")){


                if (in.equalsIgnoreCase("Nuts")) {

                    price=2.0;
                    if (price> sum) {
                        System.out.printf("Sorry, not enough money%n");
                        break;
                    } else {
                    sum-=price;
                    System.out.printf("Purchased %s%n",in);
                    }
                } else if (in.equalsIgnoreCase("Water")) {
                    price=0.7;
                    if (price> sum) {
                        System.out.printf("Sorry, not enough money%n");
                        break;
                    } else {
                        sum-=price;
                        System.out.printf("Purchased %s%n",in);
                    }
                } else if (in.equalsIgnoreCase("Crisps")) {
                    price=1.5;
                    if (price> sum) {
                        System.out.printf("Sorry, not enough money%n");
                        break;
                    } else {
                        sum-=price;
                        System.out.printf("Purchased %s%n",in);
                    }
                } else if (in.equalsIgnoreCase("Soda")) {
                    price=0.8;
                    if (price> sum) {
                        System.out.printf("Sorry, not enough money%n");
                        break;
                    } else {
                        sum-=price;
                        System.out.printf("Purchased %s%n",in);
                    }
                } else if (in.equalsIgnoreCase("Coke")) {
                    price=1.0;
                    if (price> sum) {
                        System.out.printf("Sorry, not enough money%n");
                        break;
                    } else {
                        sum-=price;
                        System.out.printf("Purchased %s%n",in);
                    }
                } else {
                    System.out.println("Invalid product");
                }

                in=scanner.nextLine();

            }

            System.out.printf("Change: %.2f",sum);

        }
    }
