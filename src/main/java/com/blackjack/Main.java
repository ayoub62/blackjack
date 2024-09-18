package com.blackjack;

import com.blackjack.cards.Card;
import com.blackjack.hands.Hand;

public class Main {

    public static void main(String[] args) {
        Hand hand = new Hand(new Card("A"));
        hand.addCard(new Card("A"));
        hand.addCard(new Card("8"));
        hand.addCard(new Card("8"));
        hand.addCard(new Card("8"));

        System.out.println(hand.isBust());
        System.out.println(hand.isBlackjack());
    }
}