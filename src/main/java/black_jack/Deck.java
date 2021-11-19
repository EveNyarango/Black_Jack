package black_jack;

import java.util.*;

public class Deck {
    /*
     * List to hold the card deck
     */
 static List<Card> cards = new ArrayList<>();

    /*
     * constructor for the deck class
     */

    public Deck() {

        this.cards = cards;
    }

    /*
     * creating a method to generate the deck of cards
     */
    public void fullDeckOfCards(){
        for (Suit cardSuit:Suit.values()){
            for (CardValue valueOfCard: CardValue.values()){
                cards.add(new Card(cardSuit,valueOfCard));
            }
        }
    }

//    random shuffles **temporary holder
    public void shuffleDeck(){
        List<Card> shuffleCards = new ArrayList<>();
//        using random
        Random random = new Random();
        int randomCardIndex = 0;
        int sizeOfOriginalCardDeck = cards.size();

        for(int i = 0; i <  cards.size() ; i++){
            randomCardIndex =random.nextInt((cards.size() - 1) - 0) + 0;
            System.out.println(randomCardIndex);

            //        adding to new deck based on the random index generated
            shuffleCards.add(cards.get(randomCardIndex));

        }
        cards = shuffleCards;
    }

//     shuffle2 ***Tomorrow**


    public void shuffle(){
        Collections.shuffle(cards);
    }

    public void CardRemover(int card) {
         cards.remove(card);
    }

    public void CardAdder(Card card){
        cards.add(card);
    }

    public  Card CardGetter(int card){
        return cards.get(card);
    }


    public void drawFromDeck(Deck card){
        cards.add(card.CardGetter(0));
        card.CardRemover(0);
    }



    @Override
    public String toString() {

        String cardListOutput = "";
        int i = 0;
        for (Card card : cards){
            cardListOutput +="\n" + i + "-" + card.toString();
            i++;
        }
        return cardListOutput;
    }
}
