package org.algos.generator;

import org.algos.builder.AlgorithmBuilder;
import org.algos.builder.SortAlgorithmBuilder;
import org.algos.enums.SortAlgoEnum;
import org.algos.factory.AlgoFactory;
import org.algos.sort.select.SelectionSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortAlgoGenerator extends AlgoFactory {

    private static final Logger logger = LoggerFactory.getLogger(SearchAlgoGenerator.class);

    SortAlgorithmBuilder algorithmBuilder;

    @Override
    public AlgorithmBuilder getAlgorithm(String type) {
        switch (SortAlgoEnum.valueOf(type)) {
            case SELECTION ->
                algorithmBuilder = new SelectionSort();
            default-> logger.info("no data-structure found");
        }
        return algorithmBuilder;
    }
}
