package com.character.creator.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.character.creator.backgroundAttributes.Talents;
import dynamodb.DynamoDbClientProvider;

import java.util.Random;

public class TalentsDao {
    private static final DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());

    public static Talents getRandomTalents() {
        int randomId = new Random().nextInt((6));
        return mapper.load(Talents.class, 0);
    }
}
