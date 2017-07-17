/*******************************************************************************
 * 2017, All rights reserved.
 *******************************************************************************/
package game;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import card.Card;
import card.CardListener;
import player.Player;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Game.
 * 
 * @author Dorian
 */
public class Game implements CardListener {
	/** List of the cards that make up the game. */
	public List<Card> cards = new ArrayList<Card>();
	
	/** Deck used in the game. */
	public Deck deck = null;
	
	/** Ba used in the game. */
	public Ba ba = null;
	
	/** Players that participate in the game. */
	public List<Player> players = new ArrayList<Player>();
	
	/** Cards that are currently selected in the game. */
	public List<Card> cardSelection = new ArrayList<Card>();
	
	/** Current player whose turn is being played. */
	public Player currentPlayer = null;

	/** Semaphore used to pause the game while it waits for a card selection. */
	public Semaphore pause = new Semaphore(1);

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
	public List<Card> getCardSelection() {
		return this.cardSelection;
	}

	/**
	 * Returns players.
	 * @return players 
	 */
	public List<Player> getPlayers() {
		return this.players;
	}

	/**
	 * Returns ba.
	 * @return ba 
	 */
	public Ba getBa() {
		return this.ba;
	}

	/**
	 * Sets a value to attribute ba. 
	 * @param newBa 
	 */
	public void setBa(Ba newBa) {
		//TODO
	}

	/**
	 * Returns deck.
	 * @return deck 
	 */
	public Deck getDeck() {
		return this.deck;
	}

	/**
	 * Sets a value to attribute decks. 
	 * @param newDeck 
	 */
	public void setDecks(Deck newDeck) {
		//TODO
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
}
