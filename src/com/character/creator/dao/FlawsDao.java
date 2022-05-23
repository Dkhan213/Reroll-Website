package com.character.creator.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.character.creator.backgroundAttributes.Alignment;
import com.character.creator.backgroundAttributes.Flaws;
import dynamodb.DynamoDbClientProvider;

import java.util.Random;

public class FlawsDao {
    private static final DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());

    public static Flaws getRandomFlaws() {
        String alignment = Alignment.getRandomAlignment();
        alignment = alignment.toLowerCase();
        int randomId = new Random().nextInt((2));
        return mapper.load(Flaws.class, "lawful_good", 0);
    }
}
