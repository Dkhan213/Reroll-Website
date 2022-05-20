package com.character.creator;

public class CharacterCreator {
    public static void main(String[] args) {
        Character character = Character.createRandomCharacter();
        int age = character.getPhysicalAttribute().getAge();
        double weight = character.getPhysicalAttribute().getWeight();
        double height = character.getPhysicalAttribute().getHeight();
        String race = character.getPhysicalAttribute().getRace().toString();
        int age2 = character.getPhysicalAttribute().getAge();

        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Race: " + race);
    }
}
