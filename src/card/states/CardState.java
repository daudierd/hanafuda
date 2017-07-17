/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package card.states;

import player.Player;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CardState.
 * 
 * @author Dorian
 */
public interface CardState {
	// Start of user code (user defined attributes for CardState)

	// End of user code

	/**
	 * Description of the method draw.
	 */
	public void draw();

	/**
	 * Description of the method draw.
	 * @param p 
	 */
	public void draw(Player p);

	/**
	 * Description of the method select.
	 */
	public void select();

	/**
	 * Description of the method score.
	 */
	public void score();

	/**
	 * Description of the method activate.
	 */
	public void activate();

	/**
	 * Description of the method lock.
	 */
	public void lock();
	
	/**
	 * Description of the method putBack.
	 */
	public void putBack();


	// Start of user code (user defined methods for CardState)

	// End of user code

}
