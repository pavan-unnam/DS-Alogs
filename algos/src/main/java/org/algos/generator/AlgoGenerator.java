package org.algos.generator;

import org.algos.factory.AlgoFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlgoGenerator {

    private static final Logger logger = LoggerFactory.getLogger(AlgoGenerator.class);

    private static final String SEARCH = "search";

    private static final String SORT = "sort";

    static AlgoFactory algoFactory;

    public static AlgoFactory toGetAlgorithm(String algoType) {
        switch (algoType.toLowerCase()) {
            case SEARCH ->
                algoFactory = new SearchAlgoGenerator();
            case SORT ->
                algoFactory = new SortAlgoGenerator();
            default ->
                logger.info("No algo provided as input");
        }
  return algoFactory;
    }
}
