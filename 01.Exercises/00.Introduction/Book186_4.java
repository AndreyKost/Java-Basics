public class Book186_4 {
    public static void main(String[] args) {

        String[] cards={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits={" of Clubss"," of Diamonds"," of Spades"," of Hearts"};

        for (int i = 1; i <=52 ; i++) {
            System.out.printf("%s",cards[i%13]);
            System.out.println(suits[i/13]);
        }




    }
}
