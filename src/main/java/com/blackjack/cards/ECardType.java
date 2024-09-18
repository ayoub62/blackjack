package com.blackjack.cards;

import java.util.Arrays;

public enum ECardType {
    ONE("1", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    J("J", 10),
    Q("Q", 10),
    K("K", 10),
    AS("A", 11);

    ECardType(String label, int value) {
        this.value = value;
        this.label = label;
    }

    private final int value;
    private final String label;

    public int getValue() {
        return value;
    }

    public static ECardType getCardByLabel(String label) {
        return Arrays.stream(ECardType.values())
                .filter(eCardType -> eCardType.label.equals(label))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
