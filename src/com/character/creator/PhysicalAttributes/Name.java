package com.character.creator.PhysicalAttributes;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;


public class Name {
    private final DynamoDBMapper dynamoDBMapper;
//    AmazonDynamoDB dynamoDBClient = DynamoDbClientProvider.getDynamoDBClient();
//    DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);

    public Name(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public static String getRandomName(Race race, Gender gender) {
        //ToDo: Connect to dynamoDb table and finish method
        return "Bob";
    }
}
