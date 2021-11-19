package black_jack;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck = new Deck();
    List<Card> cards = new ArrayList<>();


    @BeforeEach
    void setUp() {
    }

    @Test
    void fullDeckOfCards() {
        deck.fullDeckOfCards();
        assertEquals(52, Deck.cards.size());
    }

    @Test
    void shuffleDeck() {
//        confirms random printout of code
        deck.fullDeckOfCards();
        System.out.println(deck.cards);
        deck.shuffleDeck();
        System.out.println(deck.cards);

    }

    @Test
    void shuffle() {
        deck.fullDeckOfCards();
        deck.shuffleDeck();

    }

    @Test
    void cardRemover() {
        deck.fullDeckOfCards();
        deck.CardRemover(1);
        assertEquals(51,Deck.cards.size());

    }

    @Test
    void cardAdder() {
    }

    @Test
    void cardGetter() {
    }

    @Test
    void drawFromDeck() {
    }
}