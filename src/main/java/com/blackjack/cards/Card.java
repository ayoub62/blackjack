package com.blackjack.cards;

public class Card implements ICard {

    private final ECardType cardType;

    public Card(String cardLabel) {
        this.cardType = ECardType.getCardByLabel(cardLabel);
    }

    @Override
    public int getValue() {
        return this.cardType.getValue();
    }

    @Override
    public ECardType getCardType() {
        return this.cardType;
    }
}
