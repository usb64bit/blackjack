/*
 * John Ko
 * CSC-18A 
 * 47376
 */
package blackjack;

import java.util.Random;

/**
 *
 * @author usb
 */
public class Deck {
	
	public enum Suit {DIAMONDS,CLUBS,HEARTS,SPADES};
	
	private int[] Cards = new int[52];
	
	/**
	 * Deck construct
	 * populates cards with an ID
	 */
	public Deck() {
		for(int i=0; i<52; i++) {
			Cards[i] = i;
		}
	}
	
	/**
	 * Shuffle method shuffles the cards
	 */
	public void shuffle() {
		Random r = new Random();
		int len = Cards.length;
		
		while(len > 1) {
			int k = r.nextInt(len);
			len--;
			swap(len,k);
		}
	}
	
	/**
	 * Swap chapter 19
	 * @param first integer
	 * @param second integer
	 */
	public void swap(int first, int second) {
		int temp = Cards[first];
		Cards[first] = Cards[second];
		Cards[second] = temp;
	}
	
	/**
	 * get value of the card via cards ID
	 * @param num integer
	 * @return Value
	 */
	public static int getValue(int num) {
		int val = num%13;
		val++;
		return val;
	}
	
	/**
	 * getSuit
	 * @param cardID integer
	 * @return Suit.ENUM
	 */
	public Suit getSuit(int cardID) {
		if(cardID < 13) {
			return Suit.DIAMONDS;
		} else if (cardID < 26) {
			return Suit.HEARTS;
		} else if (cardID < 39) {
			return Suit.CLUBS;
		} else {
			return Suit.SPADES;
		}
	}
	
}
