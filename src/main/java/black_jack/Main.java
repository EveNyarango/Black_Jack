package black_jack;

public class Main {
    public static void main(String[] args) {

        Deck deckOfCards = new Deck();
        deckOfCards.fullDeckOfCards();
//        System.out.println(deckOfCards);
//        deckOfCards.shuffleDeck();
        System.out.println("===========");

        deckOfCards.shuffle();
        System.out.println(deckOfCards);




    }
}
