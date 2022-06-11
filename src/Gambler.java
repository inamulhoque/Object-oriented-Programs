public class Gambler extends DeckOfCard{
    static String player1;
    static String player2;
    static String player3;
    static String player4;
    public static void gamblers()
    {
        int count = 9;
        int player1Index;
        int player2Index;
        int player3Index;
        int player4Index;
        while(count>0) {
            player1Index = (int) (Math.random() * playerDeck.length);
            player2Index = (int) (Math.random() * playerDeck.length);
            player3Index = (int) (Math.random() * playerDeck.length);
            player4Index = (int) (Math.random() * playerDeck.length);
            if(playerDeck[0][player1Index] != null||playerDeck[0][player2Index] != null||playerDeck[0][player3Index] != null||playerDeck[0][player4Index] != null)
            {
                System.out.println("The player 1 is "+playerDeck[0][player1Index]);

                System.out.println("The player 2 is "+playerDeck[0][player2Index]);

                System.out.println("The player 3 is "+playerDeck[0][player3Index]);

                System.out.println("The player 4 is "+playerDeck[0][player4Index]);
            }

            count--;
        }
    }
}
