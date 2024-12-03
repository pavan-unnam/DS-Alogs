package org.algos.sort.select;

import org.algos.builder.SortAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.enums.SortAlgoEnum;
import org.algos.model.DataStructure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SelectionSort implements SortAlgorithmBuilder {

    private static final Logger logger = LoggerFactory.getLogger(SelectionSort.class);


    private final DataStructure selectionSortDataStructure = DataStructure.builder().build();


    @Override
    public Integer[]  sortingIntegerArray(Integer[] intArray, Boolean isRecursive) {
        selectionSortDataStructure.setIntArray(intArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.sortingIntegerArrayWithRecursion(intArray, intArray.length, 0);
        } else {
            for (int i = 0; i < intArray.length - 1; i++) {
                for (int j = i + 1; j < intArray.length; j++) {
                    if (intArray[i] > intArray[j]) {
                        int temp = intArray[i];
                        intArray[i] = intArray[j];
                        intArray[j] = temp;
                    }
                }
            }
        }
        return intArray;
    }

    @Override
    public String[] sortingStringArray(String[] stringArray, Boolean isRecursive) {
        selectionSortDataStructure.setStringArray(stringArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.sortingStringArrayWithRecursion(stringArray, stringArray.length, 0);
        } else {
            for (int i = 0; i < stringArray.length - 1; i++) {
                for (int j = i + 1; j < stringArray.length; j++) {
                    if (stringArray[j].compareTo(stringArray[i]) < 0) {
                        String temp = stringArray[i];
                        stringArray[i] = stringArray[j];
                        stringArray[j] = temp;
                    }
                }
            }
        }
        return stringArray;
    }

    @Override
    public Integer[][] sortingInteger2DArray(Integer[][] integer2DArray, Boolean isRecursive) {
        selectionSortDataStructure.setIntTwoDArray(integer2DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_2D_ARRAY.name());
        columnSortingInteger2DArray(integer2DArray,isRecursive);
        if(isRecursive) {
            RecursiveSelectionSort.sortingInteger2DArrayWithRecursion(integer2DArray, integer2DArray.length, 0);
        } else {
            for (int r = 0; r <= integer2DArray.length - 1; r++) {
                for (int i = 0; i < integer2DArray[r].length; i++) {
                    for (int j = i + 1; j < integer2DArray[r].length; j++) {
                        if (integer2DArray[r][i] > integer2DArray[r][j]) {
                            int temp = integer2DArray[r][i];
                            integer2DArray[r][i] = integer2DArray[r][j];
                            integer2DArray[r][j] = temp;
                        }
                    }
                }
            }
        }
        return integer2DArray;
    }

    @Override
    public Integer[][][] sortingInteger3DArray(Integer[][][] integer3DArray, Boolean isRecursive) {
        selectionSortDataStructure.setIntThreeDArray(integer3DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_3D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.sortingInteger3DArrayWithRecursion(integer3DArray, integer3DArray.length, 0);
        } else {
            for (int index = 0; index < integer3DArray.length; index++) {
                for (int r = 0; r < integer3DArray[index].length; r++) {
                    for (int i = 0; i < integer3DArray[index][r].length; i++) {
                        for (int j = i + 1; j < integer3DArray[index][r].length; j++) {
                            if (integer3DArray[index][r][i] > integer3DArray[index][r][j]) {
                                int temp = integer3DArray[index][r][i];
                                integer3DArray[index][r][i] = integer3DArray[index][r][j];
                                integer3DArray[index][r][j] = temp;
                            }
                        }
                    }
                }
            }
        }
        return integer3DArray;
    }

    @Override
    public String[][] sortingString2DArray(String[][] string2DArray, Boolean isRecursive) {
        selectionSortDataStructure.setStringTwoDArray(string2DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_2D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.sortingString2DArrayWithRecursion(string2DArray, string2DArray.length, 0);
        } else {
            for (int r = 0; r < string2DArray.length; r++) {
                for (int i = 0; i < string2DArray[r].length; i++) {
                    for (int j = i + 1; j < string2DArray[r].length; j++) {
                        if (string2DArray[r][j].compareTo(string2DArray[r][i]) < 0) {
                            String temp = string2DArray[r][i];
                            string2DArray[r][i] = string2DArray[r][j];
                            string2DArray[r][j] = temp;
                        }
                    }
                }
            }
        }
        return string2DArray;
    }

    @Override
    public String[][][] sortingString3DArray(String[][][] string3DArray, Boolean isRecursive) {
        selectionSortDataStructure.setStringThreeDArray(string3DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_3D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.sortingString3DArrayWithRecursion(string3DArray, string3DArray.length, 0);
        } else {
            for (int index = 0; index < string3DArray.length; index++) {
                for (int r = 0; r < string3DArray[index].length; r++) {
                    for (int i = 0; i < string3DArray[index][r].length; i++) {
                        for (int j = i + 1; j < string3DArray[index][r].length; j++) {
                            if (string3DArray[index][r][j].compareTo(string3DArray[index][r][i]) < 0) {
                                String temp = string3DArray[index][r][i];
                                string3DArray[index][r][i] = string3DArray[index][r][j];
                                string3DArray[index][r][j] = temp;
                            }
                        }
                    }
                }
            }
        }
        return string3DArray;
    }

    @Override
    public List<Integer> sortingIntegerList(List<Integer> integerList, Boolean isRecursive) {
        selectionSortDataStructure.setIntList(integerList);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_LIST.name());

        //itrevative
        for (int i = 0; i < integerList.size() - 1; i++) {
            for (int j = i + 1; j < integerList.size(); j++) {
                if (integerList.get(i) > integerList.get(j)) {
                    int temp = integerList.get(i);
                    int iVar = integerList.get(i);
                     int jVar = integerList.get(j);
                     iVar = jVar;
                    jVar = temp;
                }
            }
        }

        // Collections features
        Collections.sort(integerList);
        return integerList;
    }

    @Override
    public List<String> sortingStringList(List<String> stringList, Boolean isRecursive) {
        selectionSortDataStructure.setStringList(stringList);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_LIST.name());
        for (int i = 0; i < stringList.size() - 1; i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                if (stringList.get(j).compareTo(stringList.get(i)) < 0) {
                    String temp = stringList.get(i);
                    String iVar = stringList.get(i);
                    String jVar = stringList.get(j);
                    iVar = jVar;
                    jVar = temp;
                }
            }
        }
        Collections.sort(stringList);
        return stringList;
    }

    @Override
    public Map<String, String> sortingStringMapValue(Map<String, String> stringMap, Boolean isRecursive) {
        selectionSortDataStructure.setStringMap(stringMap);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_MAP.name());
        List<String> sortedKeys
                = new ArrayList<String>(stringMap.keySet());
        for (int i = 0; i < sortedKeys.size() - 1; i++) {
            for (int j = i + 1; j < sortedKeys.size(); j++) {
                if (sortedKeys.get(j).compareTo(sortedKeys.get(i)) < 0) {
                    String temp = sortedKeys.get(i);
                    String iVar = sortedKeys.get(i);
                    String jVar = sortedKeys.get(j);
                    iVar = jVar;
                    jVar = temp;
                }
            }
        }
        Collections.sort(sortedKeys);
        return stringMap;
    }

    @Override
    public String getAlgo() {
        return SortAlgoEnum.SELECTION.name();
    }

    @Override
    public DataStructure toGetDataStructure() {
        return this.selectionSortDataStructure;
    }

    @Override
    public Integer[][] columnSortingInteger2DArray(Integer[][] integer2DArray, Boolean isRecursive) {
        selectionSortDataStructure.setIntTwoDArray(integer2DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_2D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.columnSorting2DIntegerArray(integer2DArray);
        } else {
                for (int i = 0; i < integer2DArray[0].length; i++) {
                    for (int r = 0; r <= integer2DArray.length - 1; r++) {
                        for (int j = r + 1; j < integer2DArray.length; j++) {
                            if (integer2DArray[r][i] > integer2DArray[j][i]) {
                                int temp = integer2DArray[r][i];
                                integer2DArray[r][i] = integer2DArray[j][i];
                                integer2DArray[j][i] = temp;
                            }
                        }
                    }
                }
            }
        return integer2DArray;
    }

    @Override
    public String[][] columnSortingString2DArray(String[][] string2DArray, Boolean isRecursive) {
        selectionSortDataStructure.setStringTwoDArray(string2DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_2D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.columnSorting2DStringArray(string2DArray);
        } else {
            for (int i = 0; i < string2DArray[0].length; i++) {
                for (int r = 0; r <= string2DArray.length - 1; r++) {
                    for (int j = r + 1; j < string2DArray.length; j++) {
                        if (string2DArray[r][i].compareTo(string2DArray[j][i]) < 0) {
                            String temp = string2DArray[r][i];
                            string2DArray[r][i] = string2DArray[j][i];
                            string2DArray[j][i] = temp;
                        }
                    }
                }
            }
        }
        return string2DArray;
    }

    @Override
    public Integer[][][] columnSortingInteger3DArray(Integer[][][] integer3DArray, Boolean isRecursive) {
        selectionSortDataStructure.setIntThreeDArray(integer3DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.INTEGER_3D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.columnSortingInteger3DArrayWithRecursion(integer3DArray, integer3DArray.length, 0);
        } else {
            for (int index = 0; index < integer3DArray.length; index++) {
                for (int i = 0; i < integer3DArray[index][0].length; i++) {
                    for (int r = 0; r <= integer3DArray[index].length - 1; r++) {
                        for (int j = r + 1; j < integer3DArray[index].length; j++) {
                            if (integer3DArray[index][r][i] > integer3DArray[index][j][i]) {
                                int temp = integer3DArray[index][r][i];
                                integer3DArray[index][r][i] = integer3DArray[index][j][i];
                                integer3DArray[index][j][i] = temp;
                            }
                        }
                    }
                }
            }
        }
        return integer3DArray;
    }

    @Override
    public String[][][] columnSortingString3DArray(String[][][] string3DArray, Boolean isRecursive) {
        selectionSortDataStructure.setStringThreeDArray(string3DArray);
        selectionSortDataStructure.setDataStructureName(DataStructureEnum.STRING_3D_ARRAY.name());
        if(isRecursive) {
            RecursiveSelectionSort.columnSortingString3DArrayWithRecursion(string3DArray, string3DArray.length, 0);
        } else {
            for (int index = 0; index < string3DArray.length; index++) {
                for (int i = 0; i < string3DArray[index][0].length; i++) {
                    for (int r = 0; r <= string3DArray[index].length - 1; r++) {
                        for (int j = r + 1; j < string3DArray[index].length; j++) {
                            if (string3DArray[index][r][i].compareTo(string3DArray[index][j][i]) < 0) {
                                String temp = string3DArray[index][r][i];
                                string3DArray[index][r][i] = string3DArray[index][j][i];
                                string3DArray[index][j][i] = temp;
                            }
                        }
                    }
                }
            }
        }
        return string3DArray;
    }
}
