package com.character.creator.backgroundAttributes;

import java.util.Random;

public enum Alignment {
        LAWFUL_GOOD,
        NEUTRAL_GOOD,
        CHAOTIC_GOOD,
        LAWFUL_NEUTRAL,
        TRUE_NEUTRAL,
        CHAOTIC_NEUTRAL,
        LAWFUL_EVIL,
        NEUTRAL_EVIL,
        CHAOTIC_EVIL;

    public static String getRandomAlignment() {
        Random random = new Random();
        Alignment alignment = values()[random.nextInt(values().length)];
        return alignment.toString();
    }
}
