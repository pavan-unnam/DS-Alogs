package org.algos.generator;

import org.algos.builder.AlgorithmBuilder;
import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.enums.SearchAlgoEnum;
import org.algos.factory.AlgoFactory;
import org.algos.search.Linear.LinearSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchAlgoGenerator extends AlgoFactory {

    private static final Logger logger = LoggerFactory.getLogger(SearchAlgoGenerator.class);

    SearchAlgorithmBuilder algorithmBuilder;

    @Override
    public AlgorithmBuilder getAlgorithm(String type) {
        switch (SearchAlgoEnum.valueOf(type)) {
            case LINEAR ->
                algorithmBuilder = new LinearSearch();
            default -> logger.info("no data-structure found");
        }
        return algorithmBuilder;
    }
}
