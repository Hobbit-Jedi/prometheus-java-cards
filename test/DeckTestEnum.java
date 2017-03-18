/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Hobbit Jedi
 */
public class DeckTestEnum {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Card currentCard;
		Deck deck = new Deck();
		deck.print("новая");
		deck.shuffle();
		deck.print("перемешанная");
		deck.order();
		deck.print("упорядоченная");
		while (deck.hasNext())
		{
			currentCard = deck.drawOne();
			System.out.println("Вытащили карту " + currentCard.toString());
			deck.print();
		}
	}
	
}
