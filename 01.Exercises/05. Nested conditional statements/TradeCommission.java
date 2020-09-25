package com.company;

import java.util.Scanner;

public class TradeCommission {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String town=scan.nextLine();
        double sales=Double.parseDouble(scan.nextLine());
        double commission=0;


        if (sales>=0 && sales<=500) {
            if (town.equals("Sofia")) {
                commission=sales*0.050;
            } else if (town.equals("Varna")) {
                commission=sales*0.045;
            } else if (town.equals("Plovdiv")) {
                commission=sales*0.055;
            }
            else {
                System.out.println("Error");
            }

        }
        else if (sales>500 && sales<=1000) {
            if (town.equals("Sofia")) {
                commission=sales*0.07;
            } else if (town.equals("Varna")) {
                commission=sales*0.075;
            } else if (town.equals("Plovdiv")) {
                commission=sales*0.08;
            }
            else {
                System.out.println("Error");
            }
        }
        else if(sales>1000 && sales<=10000){
            if (town.equals("Sofia")) {
                commission=sales*0.08;
            } else if (town.equals("Varna")) {
                commission=sales*0.1;
            } else if (town.equals("Plovdiv")) {
                commission=sales*0.12;
            }
            else {
                System.out.println("Error");
            }
        } else if (sales >=10000) {
            if (town.equals("Sofia")) {
                commission=sales*0.12;
            } else if (town.equals("Varna")) {
                commission=sales*0.13;
            } else if (town.equals("Plovdiv")) {
                commission=sales*0.145;
            }
            else {
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Error");
        }

        System.out.printf("%.2f",commission);


    }
}