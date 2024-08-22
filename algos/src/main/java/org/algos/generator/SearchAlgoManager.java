package org.algos.generator;

import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.exception.AlgosException;
import org.algos.model.DataStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;

public class SearchAlgoManager {

    private static final Logger logger = LoggerFactory.getLogger(SearchAlgoManager.class);

    private final SearchAlgorithmBuilder searchAlgorithmBuilder;

    public SearchAlgoManager(SearchAlgorithmBuilder searchAlgorithmBuilder) {
        this.searchAlgorithmBuilder = searchAlgorithmBuilder;
    }

    public DataStructure getDataStructure() {
        return  this.searchAlgorithmBuilder.toGetDataStructure();
    }

    public String getAlgoName() {
        return this.searchAlgorithmBuilder.getAlgo();
    }

    @SuppressWarnings(value = "unchecked")
    public Object manageAlgo(String dataStructureType, Object object, String element,  Boolean isRecursive) {
        DataStructureEnum enums = DataStructureEnum.valueOfLabel(dataStructureType);
        switch(enums) {
            case INTEGER_ARRAY -> {
                int intElement = Integer.parseInt(element);
                if(object instanceof Integer[]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInIntegerArray((Integer[]) object, intElement, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }
            }
            case STRING_ARRAY -> {
                if(object instanceof String[]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInStringArray((String[]) object, element, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }
            case INTEGER_2D_ARRAY -> {
                int intElement = Integer.parseInt(element);
                if(object instanceof Integer[][]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInInteger2DArray((Integer[][]) object, intElement, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case INTEGER_3D_ARRAY -> {
                int intElement = Integer.parseInt(element);
                if(object instanceof Integer[][][]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInInteger3DArray((Integer[][][]) object, intElement, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }
            case STRING_2D_ARRAY -> {
                if(object instanceof String[][]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInString2DArray((String[][]) object, element, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case STRING_3D_ARRAY -> {
                if(object instanceof String[][][]) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInString3DArray((String[][][]) object, element, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case INTEGER_LIST,INTEGER_LINKED_LIST-> {
                int intElement = Integer.parseInt(element);
                if(object instanceof List<?>) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInIntegerList((List<Integer>) object, intElement, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" List"+ object);
                }

            }

            case STRING_LIST, STRING_LINKED_LIST-> {
                if(object instanceof List<?>) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInStringList((List<String>) object, element, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" List"+ object);
                }

            }

            case STRING_MAP-> {
                if(object instanceof Map<?,?>) {
                    return this.searchAlgorithmBuilder.toGetIndexForGivenElementInStringMap((Map<String, String>) object, element, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" List"+ object);
                }
            }
            default -> logger.info("no data-structure found");
        }
        return null;
    }
}
