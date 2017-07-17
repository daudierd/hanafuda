/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package card;

import java.util.HashSet;

import player.Player;

// End of user code

/**
 * Description of Card.
 * 
 * @author Dorian
 */
public class Card implements CardState, CardEvent {
	/**
	 * Description of the property name.
	 */
	public String name = "";

	/**
	 * Description of the property suit.
	 */
	public Suit suit = null;

	/**
	 * Description of the property cardStates.
	 */
	public HashSet<CardState> cardStates = new HashSet<CardState>();

	/**
	 * Description of the property value.
	 */
	public int value = 0;

	/**
	 * Description of the property id.
	 */
	public int id = 0;

	// Start of user code (user defined attributes for Card)

	// End of user code

	/**
	 * The constructor.
	 */
	public Card() {
		// Start of user code constructor for Card)
		super();
		// End of user code
	}

	/**
	 * Description of the method draw.
	 */
	public void draw() {
		// Start of user code for method draw
		// End of user code
	}

	/**
	 * Description of the method draw.
	 * @param p 
	 */
	public void draw(Player p) {
		// Start of user code for method draw
		// End of user code
	}

	/**
	 * Description of the method select.
	 */
	public void select() {
		// Start of user code for method select
		// End of user code
	}

	/**
	 * Description of the method score.
	 */
	public void score() {
		// Start of user code for method score
		// End of user code
	}

	/**
	 * Description of the method activate.
	 */
	public void activate() {
		// Start of user code for method activate
		// End of user code
	}

	/**
	 * Description of the method lock.
	 */
	public void lock() {
		// Start of user code for method lock
		// End of user code
	}
	
	/**
	 * Description of the method putBack.
	 */
	public void putBack() {
		// Start of user code for method lock
		// End of user code
	}

	/**
	 * Description of the method addCardListener.
	 * @param l 
	 */
	public void addCardListener(CardListener l) {
		// Start of user code for method addCardListener
		// End of user code
	}

	/**
	 * Description of the method removeCardListener.
	 * @param l 
	 */
	public void removeCardListener(CardListener l) {
		// Start of user code for method removeCardListener
		// End of user code
	}

	// Start of user code (user defined methods for Card)

	// End of user code
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
	 * Returns suit.
	 * @return suit 
	 */
	public Suit getSuit() {
		return this.suit;
	}

	/**
	 * Sets a value to attribute suit. 
	 * @param newSuit 
	 */
	public void setSuit(Suit newSuit) {
		this.suit = newSuit;
	}

	/**
	 * Returns cardStates.
	 * @return cardStates 
	 */
	public HashSet<CardState> getCardStates() {
		return this.cardStates;
	}

	/**
	 * Returns value.
	 * @return value 
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Sets a value to attribute value. 
	 * @param newValue 
	 */
	public void setValue(int newValue) {
		this.value = newValue;
	}

	/**
	 * Returns id.
	 * @return id 
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets a value to attribute id. 
	 * @param newId 
	 */
	public void setId(int newId) {
		this.id = newId;
	}
}
