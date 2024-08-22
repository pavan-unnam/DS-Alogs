package org.algos.factory;


import org.algos.builder.AlgorithmBuilder;

public abstract class AlgoFactory {

    public abstract AlgorithmBuilder getAlgorithm(String type);
}
