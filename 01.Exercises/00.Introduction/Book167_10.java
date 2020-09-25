import java.util.Scanner;

public class Book167_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=Integer.parseInt(scanner.nextLine());
        int ones=x%10;
        int tens=(x/10)%10;
        int hundreds=x/100;

        if(x>=0 && x<=999) {
            switch (hundreds) {
                case 1:
                    System.out.println("sto ");
                    break;
                case 2:
                    System.out.println("dvesta ");
                    break;
                case 3:
                    System.out.println("trista ");
                    break;
                case 4:
                    System.out.println("chetiristotin ");
                    break;
                case 5:
                    System.out.println("petstotin ");
                    break;
                case 6:
                    System.out.println("shestotin ");
                    break;
                case 7:
                    System.out.println("sedemstotin ");
                    break;
                case 8:
                    System.out.println("osemstotin ");
                    break;
                case 9:
                    System.out.println("devetstotin ");
                    break;
                case 0:
                    System.out.println("nula");
                        break;

            }

            if (tens == 0 && ones==0) {
                System.out.println();
            }
            if (tens==0 && ones!=0) {
                System.out.print("i ");
            }

            switch (tens){
                case 1:
                    if(hundreds!=0 && (tens!=0 || ones>0))
                        System.out.print("i ");
                    switch (ones) {
                        case 1:
                            System.out.println("edinadeset ");
                            break;
                        case 2:
                            System.out.println("dvanadeset ");
                            break;
                        case 3:
                            System.out.println("trinadeset ");
                            break;
                        case 4:
                            System.out.println("chetirinadeset ");
                            break;
                        case 5:
                            System.out.println("petnadeset ");
                            break;
                        case 6:
                            System.out.println("shestnadeset ");
                            break;
                        case 7:
                            System.out.println("sedemnadeset ");
                            break;
                        case 8:
                            System.out.println("osemnadeset ");
                            break;
                        case 9:
                            System.out.println("devetnadeset ");
                            break;
                        case 0:
                            System.out.println("Deset ");
                            break;
                    }
                case 2:
                    System.out.println("dvaiset ");
                    break;
                case 3:
                    System.out.println("triiset ");
                    break;
                case 4:
                    System.out.println("chetirideset ");
                    break;
                case 5:
                    System.out.println("petdeset ");
                    break;
                case 6:
                    System.out.println("shestdeset ");
                    break;
                case 7:
                    System.out.println("sedemdeset ");
                    break;
                case 8:
                    System.out.println("osemdeset ");
                    break;
                case 9:
                    System.out.println("devetdeset ");
                    break;
                case 0:
                    break;

            }
            if (tens!=1 ){
                if(tens!=0 || (hundreds!=0 && ones!=0))
                    if (ones > 0)
                    {
                        System.out.print("i ");
                    }
                switch (ones){
                    case 1:
                        System.out.println("edno ");
                        break;
                    case 2:
                        System.out.println("dve ");
                        break;
                    case 3:
                        System.out.println("tri ");
                        break;
                    case 4:
                        System.out.println("chetiri ");
                        break;
                    case 5:
                        System.out.println("pet ");
                        break;
                    case 6:
                        System.out.println("shest ");
                        break;
                    case 7:
                        System.out.println("sedem ");
                        break;
                    case 8:
                        System.out.println("osem ");
                        break;
                    case 9:
                        System.out.println("devet ");
                        break;
                    case 0:
                        if (tens!=0) {
                            System.out.println();
                        }
                        break;


                }
            }
            if (ones == 0 && tens == 0 && hundreds == 0) {
                System.out.println("Nula");
            }


        }



    }
}
