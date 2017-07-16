/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package player;

import player.Player;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of AbsPlayer.
 * 
 * @author Dorian
 */
public abstract class AbsPlayer implements Player {
	/**
	 * Description of the property cards.
	 */
	public HashSet<Card> cards = new HashSet<Card>();

	/**
	 * Description of the property name.
	 */
	public String name = "";

	/**
	 * Description of the property score.
	 */
	public String score = "";

	/**
	 * Description of the property cards.
	 */
	public HashSet<Card> cards = new HashSet<Card>();

	// Start of user code (user defined attributes for AbsPlayer)

	// End of user code

	/**
	 * The constructor.
	 */
	public AbsPlayer() {
		// Start of user code constructor for AbsPlayer)
		super();
		// End of user code
	}

	/**
	 * Description of the method pickCard.
	 */
	public void pickCard() {
		// Start of user code for method pickCard
		// End of user code
	}

	/**
	 * Description of the method matchCard.
	 * @param c 
	 */
	public void matchCard(Card c) {
		// Start of user code for method matchCard
		// End of user code
	}

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
	 */
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
	public HashSet<Card> getCards() {
		return this.cards;
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
	 * Returns score.
	 * @return score 
	 */
	public String getScore() {
		return this.score;
	}

	/**
	 * Sets a value to attribute score. 
	 * @param newScore 
	 */
	public void setScore(String newScore) {
		this.score = newScore;
	}

	/**
	 * Returns cards.
	 * @return cards 
	 */
	public HashSet<Card> getCards() {
		return this.cards;
	}

}
