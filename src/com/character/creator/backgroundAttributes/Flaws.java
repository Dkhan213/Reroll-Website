package com.character.creator.backgroundAttributes;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Flaws")
public class Flaws {
    String alignment;
    int id;
    String flaw;

    public Flaws(String alignment, int id, String flaw) {
        this.alignment = alignment;
        this.id = id;
        this.flaw = flaw;
    }

    @DynamoDBHashKey(attributeName = "alignment")
    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @DynamoDBRangeKey(attributeName = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @DynamoDBAttribute(attributeName = "flaw")
    public String getFlaw() {
        return flaw;
    }

    public void setFlaw(String flaw) {
        this.flaw = flaw;
    }

    @Override
    public String toString() {
        return "Flaw= " + flaw;
    }
}
