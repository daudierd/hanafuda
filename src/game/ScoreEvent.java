/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package game;

import card.Card;
import game.ScoreObserver;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of ScoreEvent.
 * 
 * @author Dorian
 */
public interface ScoreEvent {
	// Start of user code (user defined attributes for ScoreEvent)

	// End of user code

	/**
	 * Description of the method addScoreObserver.
	 * @param o 
	 */
	public void addScoreObserver(ScoreObserver o);

	/**
	 * Description of the method removeScoreObserver.
	 * @param o 
	 */
	public void removeScoreObserver(ScoreObserver o);

	/**
	 * Description of the method notify.
	 * @param c 
	 */
	public void notify(Card c);

	// Start of user code (user defined methods for ScoreEvent)

	// End of user code

}
