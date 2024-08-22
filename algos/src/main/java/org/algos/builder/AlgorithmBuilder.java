package org.algos.builder;

import org.algos.enums.SearchAlgoEnum;
import org.algos.model.DataStructure;

public interface AlgorithmBuilder{

    public String getAlgo();

    public DataStructure toGetDataStructure();
}
