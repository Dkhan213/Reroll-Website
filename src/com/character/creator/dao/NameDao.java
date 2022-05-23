package com.character.creator.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.character.creator.physicalAttributes.Name;
import dynamodb.DynamoDbClientProvider;

import java.util.Random;

public class NameDao {
    private static final DynamoDBMapper mapper = new DynamoDBMapper(DynamoDbClientProvider.getDynamoDBClient());

    public static Name getRandomName(String gender) {
        int randomId = new Random().nextInt((2));
        return mapper.load(Name.class, gender, randomId);
    }
}
