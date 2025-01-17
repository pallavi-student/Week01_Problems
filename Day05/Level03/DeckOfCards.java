package Day05.Level03;
import java.util.*;

public class DeckOfCards{

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Calculate number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        
        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Create deck by combining each rank with each suit
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        
        // Shuffle the deck by swapping each card with a random card
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);  // Random card number between i and deck.length - 1
            // Swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        
        return deck;
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        // Check if the deck can be evenly distributed
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return null;
        }
        
        // Calculate the number of cards each player gets
        int cardsPerPlayer = numOfCards / numOfPlayers;
        String[][] playersCards = new String[numOfPlayers][cardsPerPlayer];
        
        // Distribute cards to players
        int index = 0;
        for (int player = 0; player < numOfPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[player][card] = deck[index++];
            }
        }
        
        return playersCards;
    }

    // Method to print the players' cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playersCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck of cards
        String[] deck = initializeDeck();

        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Ask user for number of cards and players
        System.out.print("Enter the number of cards to distribute: ");
        int numOfCards = sc.nextInt();

        System.out.print("Enter the number of players: ");
        int numOfPlayers = sc.nextInt();

        // Distribute the cards to players
        String[][] playersCards = distributeCards(deck, numOfCards, numOfPlayers);

        // If distribution was successful, print the players' cards
        if (playersCards != null) {
            printPlayersCards(playersCards);
        }

        sc.close();
    }
}
