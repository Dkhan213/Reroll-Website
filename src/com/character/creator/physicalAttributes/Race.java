package com.character.creator.physicalAttributes;

import java.util.Random;

public enum Race {
    HUMAN,
    ELF,
    HALF_ELF,
    DWARF,
    HALFLING,
    GNOME;

    public static Race getRandomRace() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    //ToDo: Correct All Age, Weight, and Height values
    public int getRandomAge(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.FEMALE) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt((max - min + 1)) + min;
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            return new Random().nextInt((max - min + 1)) + min;
        }
    }

    public String getRandomHeight(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.FEMALE) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            double height = min + (max - min) * random.nextDouble();
            int feet = (int)(height/12);
            int inches = (int)(height % 12);
            return feet + "'" + inches + '\"';

        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            double height = min + (max - min) * random.nextDouble();
            int feet = (int)(height/12);
            int inches = (int)(height % 12);
            return feet + "'" + inches + '\"';
        }
    }

    public double getRandomWeight(Race race, Gender gender) {
        int max = 0;
        if (gender == Gender.FEMALE) {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            double weight = min + (max - min) * random.nextDouble();
            weight = Math.round(weight * 100);
            weight = weight/100;
            return weight;
        } else {
            switch (race) {
                case HUMAN:
                    max = 90;
                    break;
                case ELF:
                    max = 1000;
                    break;
                case HALF_ELF:
                    max = 210;
                    break;
                case DWARF:
                    max = 380;
                    break;
                case HALFLING:
                    max = 280;
                    break;
                case GNOME:
                    max = 490;
                    break;
            }
            int min = 18;

            Random random = new Random();
            double weight = min + (max - min) * random.nextDouble();
            weight = Math.round(weight * 100);
            weight = weight/100;
            return weight;
        }
    }
}

