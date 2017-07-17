/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package player;

import java.util.ArrayList;
import java.util.List;

import card.Card;

// End of user code

/**
 * Description of AbsPlayer.
 * 
 * @author Dorian
 */
public abstract class AbsPlayer implements Player {
	/** Number of players instantiated */
	private static int nbPlayers = 0;
	
	/** Name given to the player. */
	private String name;

	/** Current score of the player. */
	private int score;

	/** List of the cards in the player's hand. */
	private List<Card> hand = new ArrayList<Card>();
	
	/** List of the cards that the player has won. */
	private List<Card> wonCards = new ArrayList<Card>();

	// Start of user code (user defined attributes for AbsPlayer)

	// End of user code

	/**
	 * Default constructor.
	 */
	public AbsPlayer() {
		// Start of user code constructor for AbsPlayer)
		super();
		// End of user code
	}
	
	/**
	 * Overloaded constructor.
	 */
	public AbsPlayer(String name) {
		// Start of user code constructor for AbsPlayer)
		super();
		// End of user code
	}

	/**
	 * Description of the method pickCard.
	 */
	public abstract void pickCard();

	/**
	 * Description of the method matchCard.
	 * @param c 
	 */
	public abstract void matchCard(Card c);

	/**
	 * Description of the method lockCards.
	 */
	public void lockCards() {
		// Start of user code for method lockCards
		// End of user code
	}

	/**
	 * Description of the method unlockCards.
	 */
	public void unlockCards() {
		// Start of user code for method unlockCards
		// End of user code
	}

	/**
	 * Description of the method score.
	 * @param c1 
	 * @param c2 
	 */
	public void score(Card c1, Card c2) {
		// Start of user code for method score
		// End of user code
	}

	/**
	 * Description of the method getScore.
	 * @return score 
	 */
	@Override
	public void getScore() {
		// Start of user code for method getScore
		// End of user code
	}

	// Start of user code (user defined methods for AbsPlayer)

	// End of user code
	/**
	 * Returns cards.
	 * @return cards 
	 */
	public List<Card> getHand() {
		return this.hand;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Sets a value to attribute score. 
	 * @param newScore 
	 */
	public void setScore(int newScore) {
		this.score = newScore;
	}

	/**
	 * Returns cards.
	 * @return cards 
	 */
	public List<Card> getWonCards() {
		return this.wonCards;
	}

}
