package org.algos;

import org.algos.builder.AlgorithmBuilder;
import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.builder.SortAlgorithmBuilder;
import org.algos.factory.AlgoFactory;
import org.algos.generator.AlgoGenerator;
import org.algos.generator.SearchAlgoManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AlgoStarter {
    private static final Logger logger = LoggerFactory.getLogger(AlgoStarter.class);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        logger.info("provide the algo type input");
        //String algoType = in.nextLine();
        ///logger.info(" algo type input : %{}" , algoType);
        AlgoFactory algoFactory =AlgoGenerator.toGetAlgorithm("search");
        //Scanner algo = new Scanner(System.in);
        //logger.info("provide the algo type input");
        //String algoVariant = in.nextLine();
        logger.info(" algo type input : %{}" , "algoVariant");
        AlgorithmBuilder algorithmBuilder = algoFactory.getAlgorithm("LINEAR");
        if(algorithmBuilder instanceof SearchAlgorithmBuilder) {
            SearchAlgoManager searchAlgoManager = new SearchAlgoManager((SearchAlgorithmBuilder) algorithmBuilder);
            Integer [] abc = {1,2,3,4,5};
            Map s = new HashMap();
            s.put("s", "val");
            Collection<String> c = new HashSet<String>();
            searchAlgoManager.manageAlgo("stringMap", s, "24", false);
        } else if(algorithmBuilder instanceof SortAlgorithmBuilder) {

        }
    }
}