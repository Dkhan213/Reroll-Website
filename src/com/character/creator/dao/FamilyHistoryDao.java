package com.character.creator.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.character.creator.backgroundAttributes.FamilyHistory;
import dynamodb.DynamoDbClientProvider;

import java.util.Random;

public class FamilyHistoryDao {
    private static final DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());

    public static FamilyHistory getRandomFamilyHistory() {
        int randomId = new Random().nextInt((6));
        return mapper.load(FamilyHistory.class, randomId);

    }
}
