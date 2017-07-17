/**
 * 
 */
package card.states;

import card.Card;

/**
 * @author Dorian
 *
 */
public abstract class AbsCardState {
	protected Card card;
	
	public AbsCardState(Card card) {
		this.card = card;
	}
	
}
