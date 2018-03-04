package pkgCore;

import java.util.ArrayList;
import java.util.Random;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();

	
	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc
	
	//			Deck(2) will create an array of 104 cards.
	
	public Deck(int numberOfDecks) {
		for (int x = 1; x <= numberOfDecks; x++) {
			for (eRank rank: eRank.values()) {
				for (eSuit suit: eSuit.values()) {
					Card card = new Card(suit,rank);
					cards.add(card);
				}				
			}
		}
	}
	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card draw() {
		Random rnd = new Random();
		int index = rnd.nextInt(cards.size());
		Card card = cards.get(index);
		return card;
	}
	
	public int Size() {
		return cards.size();
	}
}
