package com.character.creator.physicalAttributes;

import com.character.creator.dao.NameDao;

public class PhysicalAttribute {
    private Name name;
    private Race race;
    private Gender gender;
    private SkinColor skin;
    private EyeColor eyeColor;
    private Hair hair;
    private int age;
    private String height;
    private double weight;

    public PhysicalAttribute(PhysicalAttributeBuilder builder) {
        this.name = builder.name;
        this.race = builder.race;
        this.gender = builder.gender;
        this.skin = builder.skinColor;
        this.eyeColor = builder.eyeColor;
        this.hair = builder.hair;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    public String getRace() {
        return "Race: " + race.toString();
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getGender() {
        return "Gender: " + gender.toString();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SkinColor getSkin() {
        return skin;
    }

    public void setSkin(SkinColor skin) {
        this.skin = skin;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Physical Attribute: " + '\n'+
                name + '\n' +
                "Race = " + race.toString() + '\n' +
                "Gender = " + gender.toString() + '\n' +
                "Skin = " + skin.toString() + '\n' +
                "Eye Color = " + eyeColor.toString() + '\n' +
                hair + '\n' +
                "Age = " + age + '\n' +
                "Height = " + height + '\n'+
                "Weight = " + weight + " lbs";
    }

    /**
     * A static method that constructs a random {@link PhysicalAttribute} and returns it
     * @return the new random PhysicalAttribute
     */
    public static PhysicalAttribute createRandomPhysicalAttribute() {
        Race race = Race.getRandomRace();
        Gender gender = Gender.getRandomGender();
        SkinColor skinColor = SkinColor.getRandomSkinColor();
        EyeColor eyeColor = EyeColor.getRandomEyeColor();
        // Calculate age, height and weight based on gender and race
        int age = race.getRandomAge(race, gender);
        String height = race.getRandomHeight(race, gender);
        double weight = race.getRandomWeight(race, gender);
//        Get random name and hair based on race and gender
        Name name = NameDao.getRandomName(gender.toString());
        Hair hair = Hair.getRandomHair(race, gender);

        return PhysicalAttribute.builder()
                .withName(name)
                .withRace(race)
                .withGender(gender)
                .withSkinColor(skinColor)
                .withEyeColor(eyeColor)
                .withHair(hair)
                .withAge(age)
                .withHeight(height)
                .withWeight(weight)
                .build();
    }

    public static PhysicalAttributeBuilder builder() {
        return new PhysicalAttributeBuilder();
    }

    public static class PhysicalAttributeBuilder {
        private Name name;
        private Race race;
        private Gender gender;
        private SkinColor skinColor;
        private EyeColor eyeColor;
        private Hair hair;
        private int age;
        private String height;
        private double weight;

        public PhysicalAttributeBuilder withName(Name name) {
            this.name = name;
            return this;
        }

        public PhysicalAttributeBuilder withRace(Race race) {
            this.race = race;
            return this;
        }

        public PhysicalAttributeBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PhysicalAttributeBuilder withSkinColor(SkinColor skinColor) {
            this.skinColor = skinColor;
            return this;
        }

        public PhysicalAttributeBuilder withEyeColor(EyeColor eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public PhysicalAttributeBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PhysicalAttributeBuilder withHeight(String height) {
            this.height = height;
            return this;
        }

        public PhysicalAttributeBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PhysicalAttributeBuilder withHair(Hair hair) {
            this.hair = hair;
            return this;
        }

        public PhysicalAttribute build() {
            return new PhysicalAttribute(this);
        }
    }
}
