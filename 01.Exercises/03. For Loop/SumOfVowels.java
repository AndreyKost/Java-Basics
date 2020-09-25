import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        int vowelSum=0;

        for (int letterIndex = 0; letterIndex <input.length() ; letterIndex++) {
            char currentLetter=input.charAt(letterIndex);

            switch (currentLetter){

                case 'a':
                    vowelSum+=1;
                    break;
                case 'e':
                    vowelSum+=2;
                    break;
                case 'i':
                    vowelSum+=3;
                    break;
                case 'o':
                    vowelSum+=4;
                    break;
                case 'u':
                    vowelSum+=5;
                    break;
            }

        }

        System.out.println(vowelSum);

    }
}
