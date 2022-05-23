package com.character.creator.backgroundAttributes;

import com.character.creator.dao.FamilyHistoryDao;
import com.character.creator.dao.FlawsDao;
import com.character.creator.dao.TalentsDao;

public class BackgroundAttribute {
    private FamilyHistory familyHistory;
    private Talents talents;
    private Flaws flaws;


    public BackgroundAttribute(BackgroundAttributeBuilder builder) {
        this.familyHistory = builder.familyHistory;
        this.talents = builder.talents;
        this.flaws = builder.flaws;
    }

    /**
     * A static method that constructs a random {@link BackgroundAttribute} and returns it
     * @return the new random BackgroundAttribute
     */
    public static BackgroundAttribute createRandomBackgroundAttribute() {
        FamilyHistory familyHistory = FamilyHistoryDao.getRandomFamilyHistory();
        Talents talents = TalentsDao.getRandomTalents();
        Flaws flaws = FlawsDao.getRandomFlaws();


        return BackgroundAttribute.builder()
                .withFamilyHistory(familyHistory)
                .withTalents(talents)
                .withFlaws(flaws)
                .build();
    }

    public static BackgroundAttributeBuilder builder() {
        return new BackgroundAttributeBuilder();
    }

    public FamilyHistory getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(FamilyHistory familyHistory) {
        this.familyHistory = familyHistory;
    }

    public Talents getTalents() {
        return talents;
    }

    public void setTalents(Talents talents) {
        this.talents = talents;
    }

    public Flaws getFlaws() {
        return flaws;
    }

    public void setFlaws(Flaws flaws) {
        this.flaws = flaws;
    }

    @Override
    public String toString() {
        return "Background Attribute: " + '\n'+
                familyHistory + '\n' +
                talents + '\n' +
                "Flaws = ";
    }

    public static class BackgroundAttributeBuilder {
        private FamilyHistory familyHistory;
        private Talents talents;
        private Flaws flaws;

        public BackgroundAttributeBuilder withFamilyHistory(FamilyHistory familyHistory) {
            this.familyHistory = familyHistory;
            return this;
        }

        public BackgroundAttributeBuilder withTalents(Talents talents) {
            this.talents = talents;
            return this;
        }

        public BackgroundAttributeBuilder withFlaws(Flaws flaws) {
            this.flaws = flaws;
            return this;
        }

        public BackgroundAttribute build() {
            return new BackgroundAttribute(this);
        }
    }
}
