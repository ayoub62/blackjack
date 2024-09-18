package com.blackjack.hands;

import com.blackjack.cards.ICard;
import com.blackjack.counters.Counter;
import com.blackjack.counters.ICounter;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Hand implements IHand {

    private final int BLACKJACK_SCORE = 21;

    private final List<ICard> cards;
    private final ICounter counter = new Counter();

    public Hand(ICard... cards) {
        this.cards = new ArrayList<>(asList(cards));
    }

    @Override
    public void addCard(ICard card) {
        this.cards.add(card);
    }

    @Override
    public boolean isBlackjack() {
        return this.getPoint() == BLACKJACK_SCORE && this.cards.size() == 2;
    }

    @Override
    public boolean isBust() {
        // quand ça depasse 21, on restitue une valeur de -1
        return this.getPoint() < 0;
    }

    @Override
    public List<ICard> getCards() {
        return this.cards;
    }

    @Override
    public int getPoint() {
        return this.counter.count(this);
    }
}
