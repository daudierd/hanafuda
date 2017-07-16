/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package player;

import card.Card;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Player.
 * 
 * @author Dorian
 */
public interface Player {
	// Start of user code (user defined attributes for Player)

	// End of user code

	/**
	 * Description of the method pickCard.
	 */
	public void pickCard();

	/**
	 * Description of the method matchCard.
	 * @param c 
	 */
	public void matchCard(Card c);

	/**
	 * Description of the method lockCards.
	 */
	public void lockCards();

	/**
	 * Description of the method unlockCards.
	 */
	public void unlockCards();

	/**
	 * Description of the method score.
	 * @param c1 
	 * @param c2 
	 */
	public void score(Card c1, Card c2);

	/**
	 * Description of the method getScore.
	 */
	public void getScore();

	// Start of user code (user defined methods for Player)

	// End of user code

}
