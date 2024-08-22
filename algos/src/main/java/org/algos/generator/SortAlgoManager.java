package org.algos.generator;

import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.builder.SortAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.exception.AlgosException;
import org.algos.model.DataStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class SortAlgoManager {

    private static final Logger logger = LoggerFactory.getLogger(SortAlgoManager.class);

    private final SortAlgorithmBuilder sortAlgorithmBuilder;

    public SortAlgoManager(SortAlgorithmBuilder sortAlgorithmBuilder) {
        this.sortAlgorithmBuilder = sortAlgorithmBuilder;
    }

    public DataStructure getDataStructure() {
        return  this.sortAlgorithmBuilder.toGetDataStructure();
    }

    public String getAlgoName() {
        return this.sortAlgorithmBuilder.getAlgo();
    }

    @SuppressWarnings(value = "unchecked")
    public Object manageAlgo(String dataStructureType, Object object, Boolean isRecursive, Boolean isColumnSorting) {
        DataStructureEnum enums = DataStructureEnum.valueOfLabel(dataStructureType);
        switch(enums) {
            case INTEGER_ARRAY -> {
                if(object instanceof Integer[]) {
                    return this.sortAlgorithmBuilder.sortingIntegerArray((Integer[]) object, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }
            }
            case STRING_ARRAY -> {
                if(object instanceof String[]) {
                    return this.sortAlgorithmBuilder.sortingStringArray((String[]) object, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }
            case INTEGER_2D_ARRAY -> {
                if(object instanceof Integer[][]) {
                    if(isColumnSorting) {
                        return this.sortAlgorithmBuilder.columnSortingInteger2DArray((Integer[][]) object, isRecursive);
                    } else {
                        return this.sortAlgorithmBuilder.sortingInteger2DArray((Integer[][]) object, isRecursive);
                    }
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case INTEGER_3D_ARRAY -> {
                if(object instanceof Integer[][][]) {
                    if(isColumnSorting) {
                        return this.sortAlgorithmBuilder.columnSortingInteger3DArray((Integer[][][]) object, isRecursive);
                    } else {
                        return this.sortAlgorithmBuilder.sortingInteger3DArray((Integer[][][]) object, isRecursive);
                    }
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }
            case STRING_2D_ARRAY -> {
                if(object instanceof String[][]) {
                    if(isColumnSorting) {
                        return this.sortAlgorithmBuilder.columnSortingString2DArray((String[][]) object, isRecursive);
                    } else {
                        return this.sortAlgorithmBuilder.sortingString2DArray((String[][]) object, isRecursive);
                    }
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case STRING_3D_ARRAY -> {
                if(object instanceof String[][][]) {
                    if(isColumnSorting) {
                        return this.sortAlgorithmBuilder.columnSortingString3DArray((String[][][]) object, isRecursive);
                    } else {
                        return this.sortAlgorithmBuilder.sortingString3DArray((String[][][]) object, isRecursive);
                    }
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" array"+ object);
                }

            }

            case INTEGER_LIST,INTEGER_LINKED_LIST-> {
                if(object instanceof List<?>) {
                    return this.sortAlgorithmBuilder.sortingIntegerList((List<Integer>) object, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" List"+ object);
                }

            }

            case STRING_LIST, STRING_LINKED_LIST-> {
                if(object instanceof List<?>) {
                    return this.sortAlgorithmBuilder.sortingStringList((List<String>) object, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" List"+ object);
                }

            }

            case STRING_MAP-> {
                if(object instanceof Map<?,?>) {
                    return this.sortAlgorithmBuilder.sortingStringMapValue((Map<String, String>) object, isRecursive);
                } else {
                    throw new AlgosException("enum type is  but getting not"+dataStructureType+" Map"+ object);
                }

            }
            default -> logger.info("no data-structure found");
        }
        return null;
    }
}
