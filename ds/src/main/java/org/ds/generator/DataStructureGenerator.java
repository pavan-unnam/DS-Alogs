package org.ds.generator;

import org.ds.enums.CollectionOpreationsEnum;
import org.ds.factory.DataStructureFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DataStructureGenerator {

    private static final Logger logger = LoggerFactory.getLogger(DataStructureGenerator.class);
    static DataStructureFactory dataStructureFactory;
    public static DataStructureFactory toGetCollection(String algoType) {
        switch (CollectionOpreationsEnum.valueOf(algoType)) {
            case LIST -> dataStructureFactory = new ListCollectionGenerator();
            case SET -> dataStructureFactory = new SetCollectionGenerator();
            case MAP -> dataStructureFactory = new MapCollectionGenerator();
            case QUEUE -> dataStructureFactory = new QueueCollectionGenerator();
            case DEQUE -> dataStructureFactory = new DequeCollectionGenerator();
            case ARRAYS -> dataStructureFactory = new ArraysCollectionsGenerator();
            default -> logger.info("data structure not found");
        }
        return dataStructureFactory;
    }
}
