package com.blackjack.hands;

import com.blackjack.cards.ICard;

import java.util.List;

public interface IHand {

    int getPoint();

    void addCard(ICard card);

    boolean isBlackjack();

    boolean isBust();

    List<ICard> getCards();
}
