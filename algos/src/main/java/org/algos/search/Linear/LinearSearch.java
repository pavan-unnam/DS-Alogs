package org.algos.search.Linear;

import lombok.extern.slf4j.Slf4j;
import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.enums.SearchAlgoEnum;
import org.algos.model.DataStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@Slf4j
public class LinearSearch implements SearchAlgorithmBuilder {

    private static final Logger logger = LoggerFactory.getLogger(LinearSearch.class);


    private final DataStructure linearSearchDataStructure = DataStructure.builder().build();


    @Override
    public String getAlgo() {
        logger.info("Linear algorithm");
        return SearchAlgoEnum.LINEAR.name();
    }

    @Override
    public DataStructure toGetDataStructure() {
        return this.linearSearchDataStructure;
    }

    @Override
    public Integer toGetIndexForGivenElementInIntegerArray(Integer[] intArray, int element, Boolean isRecursive) {
        linearSearchDataStructure.setIntArray(intArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.INTEGER_ARRAY.name());
        int index = 0;
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInIntegerArrayWithRecursion(intArray, element, intArray.length, index);
        } else {
            for(int i = 0; i<intArray.length;i++) {
                if(intArray[i]==element) {
                    index = i;
                    logger.info("element found at the index of Integer array {}", index);
                    break;
                }
            }
        }
        return index;
    }

    @Override
    public Integer toGetIndexForGivenElementInStringArray(String[] stringArray, String element, Boolean isRecursive) {
        linearSearchDataStructure.setStringArray(stringArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.STRING_ARRAY.name());
        int index = 0;
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInStringArrayWithRecursion(stringArray, element, stringArray.length, index);
        } else {
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].equals(element)) {
                    index = i;
                    logger.info("element found at the index of String array {}", index);
                    break;
                }
            }
        }
        return index;
    }

    @Override
    public String toGetIndexForGivenElementInInteger2DArray(Integer[][] int2DArray, int element, Boolean isRecursive) {
        linearSearchDataStructure.setIntTwoDArray(int2DArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.INTEGER_2D_ARRAY.name());
        String index = "";
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInInteger2DArrayWithRecursion(int2DArray, element, 0, 0);
        } else {
            for (int rows = 0; rows < int2DArray.length; rows++) {
                for (int columns = 0; columns < int2DArray[rows].length; columns++) {
                    if (int2DArray[rows][columns] == element) {
                        index = rows + "," + columns;
                        logger.info("element found at the index of Integer2DArray {}", index);
                        break;
                    }
                }
            }
        }
        return index;
    }

    @Override
    public String toGetIndexForGivenElementInInteger3DArray(Integer[][][] int3DArray, int element, Boolean isRecursive) {
        linearSearchDataStructure.setIntThreeDArray(int3DArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.INTEGER_3D_ARRAY.name());
        String index = "";
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInInteger3DArrayWithRecursion(int3DArray, int3DArray.length, 0, element);
        } else {
            for (int num = 0; num < int3DArray.length; num++) {
                for (int rows = 0; rows < int3DArray[num].length; rows++) {
                    for (int columns = 0; columns < int3DArray[num][rows].length; columns++) {
                        if (int3DArray[num][rows][columns] == element) {
                            index = num + "," + rows + "," + columns;
                            logger.info("element found at the index of Integer3DArray {}", index);
                            break;
                        }
                    }
                }
            }
        }
        return index;
    }

    @Override
    public String toGetIndexForGivenElementInString2DArray(String[][] string2DArray, String element, Boolean isRecursive) {
        linearSearchDataStructure.setStringTwoDArray(string2DArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.STRING_2D_ARRAY.name());
        String index = "";
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInString2DArrayWithRecursion(string2DArray, element, 0, 0);
        } else {
            for (int rows = 0; rows < string2DArray.length; rows++) {
                for (int columns = 0; columns < string2DArray[rows].length; columns++) {
                    if (string2DArray[rows][columns].equals(element)) {
                        index = rows + "," + columns;
                        logger.info("element found at the index of String2DArray {}", index);
                        break;
                    }
                }
            }
        }
        return index;
    }

    @Override
    public String toGetIndexForGivenElementInString3DArray(String[][][] string3DArray, String element, Boolean isRecursive) {
        linearSearchDataStructure.setStringThreeDArray(string3DArray);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.STRING_3D_ARRAY.name());
        String index = "";
        if(isRecursive) {
            index = RecursiveLinearSearch.searchingElementInString3DArrayWithRecursion(string3DArray, string3DArray.length, 0, element);
        } else {
            for (int num = 0; num < string3DArray.length; num++) {
                for (int rows = 0; rows < string3DArray[num].length; rows++) {
                    for (int columns = 0; columns < string3DArray[num][rows].length; columns++) {
                        if (string3DArray[num][rows][columns].equals(element)) {
                            index = num + "," + rows + "," + columns;
                            logger.info("element found at the index of String3DArray {}", index);
                            break;
                        }
                    }
                }
            }
        }
        return index;
    }

    @Override
    public Integer toGetIndexForGivenElementInIntegerList(List<Integer> integerList, int element, Boolean isRecursive) {
        linearSearchDataStructure.setIntList(integerList);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.INTEGER_LIST.name());
        int index = 0;
        for(int i = 0; i<integerList.size();i++) {
            if(integerList.get(i).equals(element)) {
                index = i;
                logger.info("element found at the index of Integer List {}", index);
                break;
            }
        }
        return index;
    }

    @Override
    public Integer toGetIndexForGivenElementInStringList(List<String> stringList, String element, Boolean isRecursive) {
        linearSearchDataStructure.setStringList(stringList);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.STRING_LIST.name());
        int index = 0;
        for(int i = 0; i<stringList.size();i++) {
            if(stringList.get(i).equals(element)) {
                index = i;
                logger.info("element found at the index of String List {}", index);
                break;
            }
        }
        return index;
    }

    @Override
    public String toGetIndexForGivenElementInStringMap(Map<String, String> stringMap, String element, Boolean isRecursive) {
        linearSearchDataStructure.setStringMap(stringMap);
        linearSearchDataStructure.setDataStructureName(DataStructureEnum.STRING_MAP.name());
        String key="";
        for(String keys : stringMap.keySet()) {
            if(stringMap.get(keys).equals(element)) {
                key  = keys;
                logger.info("element found at the index of String Map {}", key);
                break;
            }
        }
        return key;
    }
}
