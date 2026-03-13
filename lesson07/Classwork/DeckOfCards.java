/*
* The problem is to write a program that picks 4 cards randomly from a deck fo 52 cards.
* All cards can be represented using an array named desk, filled with initial values 0-51.
* Start at Aces to Kings
* 0 - 12 Spades; 13 - 25 Hearts; 26 - 38 Diamonds; 39 - 51 Clubs
*/

public class DeckOfCards {
    public static void main(String[] args) {
        // Create arrays
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
                          "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            // Swap indexes
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];  // cardNumber / 13 calculates for suit
            String rank = ranks[deck[i] % 13];  // cardNumber % 13 calculates for rank
            System.out.println("Card # " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
