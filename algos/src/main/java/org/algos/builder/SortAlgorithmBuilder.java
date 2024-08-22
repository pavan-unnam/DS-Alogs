package org.algos.builder;

import java.util.List;
import java.util.Map;

public interface SortAlgorithmBuilder extends AlgorithmBuilder{

    public Integer[] sortingIntegerArray(Integer[] integerArray, Boolean isRecursive);

    public String[] sortingStringArray(String[] stringArray, Boolean isRecursive);

    public Integer[][] sortingInteger2DArray(Integer[][] integer2DArray, Boolean isRecursive);

    public Integer[][][] sortingInteger3DArray(Integer[][][] integer3DArray, Boolean isRecursive);

    public String[][] sortingString2DArray(String[][] string2DArray, Boolean isRecursive);

    public String[][][] sortingString3DArray(String[][][] string3DArray, Boolean isRecursive);

    public List<Integer> sortingIntegerList(List<Integer> integerList, Boolean isRecursive);

    public List<String> sortingStringList(List<String> stringList, Boolean isRecursive);

    public Map<String,String> sortingStringMapValue(Map<String,String> stringMap, Boolean isRecursive);

    public Integer[][] columnSortingInteger2DArray(Integer[][] integer2DArray, Boolean isRecursive);

    public String[][] columnSortingString2DArray(String[][] string2DArray, Boolean isRecursive);

    public Integer[][][] columnSortingInteger3DArray(Integer[][][] integer3DArray, Boolean isRecursive);

    public String[][][] columnSortingString3DArray(String[][][] string3DArray, Boolean isRecursive);
}
