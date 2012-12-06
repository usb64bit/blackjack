/*
 * John Ko
 * CSC-18A 
 * 47376
 */
package blackjack;

import blackjack.Deck.Suit;

/**
 *
 * @author usb
 */
public class BlackJack {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Deck deck = new Deck();
		String asdf = Deck.Suit.valueOf("CLUBS").name();
		Application app = new Application();
		System.out.println(asdf);
	}
}
