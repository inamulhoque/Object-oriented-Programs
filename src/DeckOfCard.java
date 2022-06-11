import java.util.*;
public class DeckOfCard {
    final static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    final static String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    static String[][] playerDeck = new String[suit.length][Rank.length];
    public static void main(String[] args) {
        System.out.println("Welcome to Deck of Cards!!");
        int indexOfSuit = 0;
        int indexOfRank = 0;
        for(int i = 0;i<suit.length;i++)
        {
            for(int j = 0;j< Rank.length;j++)
            {
                indexOfRank = (int)(Math.random()* Rank.length);
                indexOfSuit = (int)(Math.random()* suit.length);

                playerDeck[indexOfSuit][indexOfRank] =suit[i]+" "+Rank[j];
            }
        }
        for(int i = 0;i<suit.length;i++)
        {
            for(int j = 0;j< Rank.length;j++)
            {
                System.out.print(playerDeck[i][j]+" ");
            }
            System.out.println();
        }

        Gambler p = new Gambler();
        p.gamblers();

    }
}
