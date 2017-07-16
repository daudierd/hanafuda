/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package card;

import card.CardListener;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CardEvent.
 * 
 * @author Dorian
 */
public interface CardEvent {
	// Start of user code (user defined attributes for CardEvent)

	// End of user code

	/**
	 * Description of the method addCardListener.
	 * @param l 
	 */
	public void addCardListener(CardListener l);

	/**
	 * Description of the method removeCardListener.
	 * @param l 
	 */
	public void removeCardListener(CardListener l);

	/**
	 * Description of the method select.
	 */
	public void select();

	// Start of user code (user defined methods for CardEvent)

	// End of user code

}
