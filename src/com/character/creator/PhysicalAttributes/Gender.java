package com.character.creator.PhysicalAttributes;

import java.util.Random;

public enum Gender {
    Male,
    Female;

    public static Gender getRandomGender() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

