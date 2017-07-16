/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package game;

import java.util.HashSet;

import card.Card;

// End of user code

/**
 * Description of Scoreboard.
 * 
 * @author Dorian
 */
public class Scoreboard implements ScoreEvent {
	/**
	 * Description of the property scoreObservers.
	 */
	public HashSet<ScoreObserver> scoreObservers = new HashSet<ScoreObserver>();

	// Start of user code (user defined attributes for Scoreboard)

	// End of user code

	/**
	 * The constructor.
	 */
	public Scoreboard() {
		// Start of user code constructor for Scoreboard)
		super();
		// End of user code
	}

	/**
	 * Description of the method addScoreObserver.
	 * @param o 
	 */
	public void addScoreObserver(ScoreObserver o) {
		// Start of user code for method addScoreObserver
		// End of user code
	}

	/**
	 * Description of the method removeScoreObserver.
	 * @param o 
	 */
	public void removeScoreObserver(ScoreObserver o) {
		// Start of user code for method removeScoreObserver
		// End of user code
	}

	/**
	 * Description of the method notify.
	 * @param c 
	 */
	public void notify(Card c) {
		// Start of user code for method notify
		// End of user code
	}

	// Start of user code (user defined methods for Scoreboard)

	// End of user code
	/**
	 * Returns scoreObservers.
	 * @return scoreObservers 
	 */
	public HashSet<ScoreObserver> getScoreObservers() {
		return this.scoreObservers;
	}

}
