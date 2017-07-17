/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package card;

import card.states.*;
import player.Player;

/**
 * Description of Card.
 * 
 * @author Dorian
 */
public class Card implements CardState, CardEvent {
	/** Indicative name given to a card. */
	private String name;

	/** Suit that the card belongs to, represented by a calendar month. */
	private Suit suit;

	/* 
	 * Card states used to implement the state machine pattern
	 */
	/** State of the card that is still in the deck. */
	public final CardState IN_DECK = new InDeck(this);
	/** State of the card that is in the Ba. */
	public final CardState IN_BA = new InBa(this);
	/** State of the card that is can be played by the current player. */
	public final CardState PLAYABLE = new Playable(this);
	/** State of the card that has been selected for a match. */
	public final CardState SELECTED = new Selected(this);
	/** State of the card that can be played from the Ba. */
	public final CardState ACTIVATED = new Activated(this);
	/** State of the card in a player's hand that cannot be played. */
	public final CardState LOCKED = new Locked(this);
	/** State of the card that a player has won. */
	public final CardState SCORED = new Scored(this);
	
	/** Current state of the card. */
	private CardState currentState;
	
	/** Value of the card in points. */
	private int value;

	/** Unique id used to identify a card. */
	private int id;
	
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
	 * @return the currentState
	 */
	public CardState getCurrentState() {
		return currentState;
	}

	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(CardState currentState) {
		this.currentState = currentState;
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
