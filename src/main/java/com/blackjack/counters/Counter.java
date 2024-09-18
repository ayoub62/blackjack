package com.blackjack.counters;

import com.blackjack.cards.ECardType;
import com.blackjack.cards.ICard;
import com.blackjack.hands.IHand;

import java.util.List;

public class Counter implements ICounter {

    @Override
    public int count(IHand hand) {
        return this.count(0, 0, hand);
    }

    public int count(int index, int sum, IHand hand) {

        List<ICard> cards = hand.getCards();

        if (index == cards.size()) {
            return sum > 21 ? -1 : sum;
        }

        ICard card = cards.get(index);

        if (ECardType.AS != card.getCardType()) {
            return count(index + 1, sum + card.getValue(), hand);
        }

        int left = count(index + 1, sum + 1, hand);
        int right = count(index + 1, sum + 11, hand);

        return Math.max(
                left,
                right
        );
    }
}
