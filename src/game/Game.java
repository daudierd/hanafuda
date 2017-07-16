/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package game;

import card.CardListener;
import java.util.HashSet;
import player.Player;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Game.
 * 
 * @author Dorian
 */
public class Game implements CardListener {
	/**
	 * Description of the property cardSelection.
	 */
	public HashSet<String> cardSelection = new HashSet<String>();

	/**
	 * Description of the property players.
	 */
	public HashSet<Player> players = new HashSet<Player>();

	/**
	 * Description of the property cards.
	 */
	public HashSet<Card> cards = new HashSet<Card>();

	/**
	 * Description of the property cards.
	 */
	public HashSet<Card> cards = new HashSet<Card>();

	/**
	 * Description of the property bas.
	 */
	public Ba bas = null;

	/**
	 * Description of the property decks.
	 */
	public Deck decks = null;

	/**
	 * Description of the property currentPlayer.
	 */
	public Player currentPlayer = null;

	/**
	 * Description of the property lock.
	 */
	public Boolean lock = Boolean.FALSE;

	// Start of user code (user defined attributes for Game)

	// End of user code

	/**
	 * The constructor.
	 */
	public Game() {
		// Start of user code constructor for Game)
		super();
		// End of user code
	}

	/**
	 * Description of the method initialize.
	 */
	public void initialize() {
		// Start of user code for method initialize
		// End of user code
	}

	/**
	 * Description of the method addPlayer.
	 * @param p 
	 */
	public void addPlayer(Player p) {
		// Start of user code for method addPlayer
		// End of user code
	}

	/**
	 * Description of the method distribute.
	 */
	public void distribute() {
		// Start of user code for method distribute
		// End of user code
	}

	/**
	 * Description of the method start.
	 */
	public void start() {
		// Start of user code for method start
		// End of user code
	}

	/**
	 * Description of the method nextPlayer.
	 */
	public void nextPlayer() {
		// Start of user code for method nextPlayer
		// End of user code
	}

	/**
	 * Description of the method selected.
	 * @param c 
	 */
	public void selected(Card c) {
		// Start of user code for method selected
		// End of user code
	}

	// Start of user code (user defined methods for Game)

	// End of user code
	/**
	 * Returns cardSelection.
	 * @return cardSelection 
	 */
	public HashSet<String> getCardSelection() {
		return this.cardSelection;
	}

	/**
	 * Returns players.
	 * @return players 
	 */
	public HashSet<Player> getPlayers() {
		return this.players;
	}

	/**
	 * Returns cards.
	 * @return cards 
	 */
	public HashSet<Card> getCards() {
		return this.cards;
	}

	/**
	 * Returns cards.
	 * @return cards 
	 */
	public HashSet<Card> getCards() {
		return this.cards;
	}

	/**
	 * Returns bas.
	 * @return bas 
	 */
	public Ba getBas() {
		return this.bas;
	}

	/**
	 * Sets a value to attribute bas. 
	 * @param newBas 
	 */
	public void setBas(Ba newBas) {
		if (this.bas != null) {
			this.bas.set(null);
		}
		this.bas.set(this);
	}

	/**
	 * Returns decks.
	 * @return decks 
	 */
	public Deck getDecks() {
		return this.decks;
	}

	/**
	 * Sets a value to attribute decks. 
	 * @param newDecks 
	 */
	public void setDecks(Deck newDecks) {
		if (this.decks != null) {
			this.decks.set(null);
		}
		this.decks.set(this);
	}

	/**
	 * Returns currentPlayer.
	 * @return currentPlayer 
	 */
	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	/**
	 * Sets a value to attribute currentPlayer. 
	 * @param newCurrentPlayer 
	 */
	public void setCurrentPlayer(Player newCurrentPlayer) {
		this.currentPlayer = newCurrentPlayer;
	}

	/**
	 * Returns lock.
	 * @return lock 
	 */
	public Boolean getLock() {
		return this.lock;
	}

	/**
	 * Sets a value to attribute lock. 
	 * @param newLock 
	 */
	public void setLock(Boolean newLock) {
		this.lock = newLock;
	}

}
