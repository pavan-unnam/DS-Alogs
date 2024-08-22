package org.algos.builder;

import java.util.List;
import java.util.Map;

public interface SearchAlgorithmBuilder extends AlgorithmBuilder {

    public Integer toGetIndexForGivenElementInIntegerArray(Integer[] intArray, int element, Boolean isRecursive);

    public Integer toGetIndexForGivenElementInStringArray(String[] stringArray, String element, Boolean isRecursive);

    public String toGetIndexForGivenElementInInteger2DArray(Integer[][] intArray, int element, Boolean isRecursive);

    public String toGetIndexForGivenElementInInteger3DArray(Integer[][][] intArray, int element, Boolean isRecursive);

    public String toGetIndexForGivenElementInString2DArray(String[][] string2DArray, String element, Boolean isRecursive);

    public String toGetIndexForGivenElementInString3DArray(String[][][] string2DArray, String element, Boolean isRecursive);

    public Integer toGetIndexForGivenElementInIntegerList(List<Integer> integerList, int element, Boolean isRecursive);

    public Integer toGetIndexForGivenElementInStringList(List<String> stringList, String element, Boolean isRecursive);

    public String toGetIndexForGivenElementInStringMap(Map<String,String> stringMap, String element, Boolean isRecursive);
}
