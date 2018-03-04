package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		//	TODO: Build a deck(1), make sure there are 52 cards in the deck
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
		Deck deck1 = new Deck(1);
		
		
		if (deck1.Size() != 52) {
			fail("deck1 = " + deck1.Size());
		}
		
		Deck deck2 = new Deck(6);
		if (deck2.Size() != 312) {
			fail("deck1 = " + deck2.Size());
		}
	}

}
