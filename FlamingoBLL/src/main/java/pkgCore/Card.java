package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	//	TODO: Card has two attributes, eRank and eSuit, add these attributes
	private eRank eRank;
	private eSuit eSuit;
	
	//	TODO: Build a constructor for Card passing in eRank and eSuit
	public Card(eSuit eSuit, eRank eRank) {
		this.eSuit = eSuit;
		this.eRank = eRank;
	}
	
	//	TODO: Add a public 'getter' method for eRank and eSuit.  
	//			Add a private 'setter' method for eRank and eSuit

	public eRank geteRank() {
		return eRank;
	}
	public eSuit geteSuit() {
		return eSuit;
	}
	private void seteRank(eRank eRank) {
		this.eRank = eRank;
	}
	private void seteSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

	}
	
}
