package org.algos.sort.select;

import org.algos.builder.AlgorithmBuilder;
import org.algos.builder.SortAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.enums.SortAlgoEnum;
import org.algos.factory.AlgoFactory;
import org.algos.generator.AlgoGenerator;
import org.algos.generator.SortAlgoManager;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RecursiveSelectionSortTest {

    static SortAlgoManager sortAlgoManager;
    static Boolean isRecursive=false;
    Boolean isColumnSorting = false;

    @BeforeAll
    static void setup() {
        AlgoFactory algoFactory = AlgoGenerator.toGetAlgorithm("sort");
        AlgorithmBuilder algorithmBuilder = algoFactory.getAlgorithm(SortAlgoEnum.SELECTION.name());
        if(algorithmBuilder instanceof SortAlgorithmBuilder) {
            sortAlgoManager = new SortAlgoManager((SortAlgorithmBuilder) algorithmBuilder);
        }
        isRecursive = true;
    }

    @Test
    public void testSortIntegerArray() {
        Integer[] integer = null;
        Integer [] intArray = {1,2,5,4,3};
        Object integerObject = sortAlgoManager.manageAlgo("integerArray", intArray, isRecursive, isColumnSorting);
        if(integerObject instanceof Integer[]) {
            integer = (Integer[])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_ARRAY.name(),dsName);
        Assertions.assertEquals(intArray,sortAlgoManager.getDataStructure().getIntArray());
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideIntegerArguments")
    public void testSortIntegerArrayWithParameters( Integer[] intArray, Integer[] result) {
        Integer[] integer = null;
        Object integerObject = sortAlgoManager.manageAlgo("integerArray", intArray, isRecursive, isColumnSorting);
        if(integerObject instanceof Integer[]) {
            integer = (Integer[])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_ARRAY.name(),dsName);
        Assertions.assertEquals(intArray,sortAlgoManager.getDataStructure().getIntArray());
        MatcherAssert.assertThat(integer, Matchers.arrayContaining(result));
    }


    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideStringArguments")
    public void testSortStringArrayWithParameters( String[] stringArray, String[] result) {
        String[] string = null;
        Object stringObject = sortAlgoManager.manageAlgo("stringArray", stringArray, isRecursive, isColumnSorting);
        if(stringObject instanceof String[]) {
            string = (String[])stringObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_ARRAY.name(),dsName);
        Assertions.assertEquals(stringArray,sortAlgoManager.getDataStructure().getStringArray());
        MatcherAssert.assertThat(string, Matchers.arrayContainingInAnyOrder(result));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideInteger2DArguments")
    public void testSortInteger2DArrayWithParameters( Integer[][] integer2DArray, Integer[][] result) {
        Integer[][] integer = null;
        Object integerObject = sortAlgoManager.manageAlgo("integer2DArray", integer2DArray, isRecursive, isColumnSorting);
        if(integerObject instanceof Integer[][]) {
            integer = (Integer[][])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer2DArray,sortAlgoManager.getDataStructure().getIntTwoDArray());
        MatcherAssert.assertThat(integer, Matchers.arrayContaining(integer2DArray));
    }


    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideInteger3DArguments")
    public void testSortInteger3DArrayWithParameters( Integer[][][] integer3DArray, Integer[][][] result) {
        Integer[][][] integer = null;
        Object integerObject = sortAlgoManager.manageAlgo("integer3DArray", integer3DArray, isRecursive, isColumnSorting);
        if(integerObject instanceof Integer[][][]) {
            integer = (Integer[][][])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer3DArray,sortAlgoManager.getDataStructure().getIntThreeDArray());
        MatcherAssert.assertThat(integer, Matchers.arrayContainingInAnyOrder(integer3DArray));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideString2DArguments")
    public void testSortStringArray2DWithParameters( String[][] string2DArray, String[][] result) {
        String[][] string = null;
        Object stringObject = sortAlgoManager.manageAlgo("string2DArray", string2DArray, isRecursive, isColumnSorting);
        if(stringObject instanceof String[][]) {
            string = (String[][])stringObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(string2DArray,sortAlgoManager.getDataStructure().getStringTwoDArray());
        MatcherAssert.assertThat(string, Matchers.arrayContainingInAnyOrder(result));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideString3DArguments")
    public void testSortStringArray3DWithParameters( String[][][] string3DArray, String[][][] result) {
        String[][][] string = null;
        Object stringObject = sortAlgoManager.manageAlgo("string3DArray", string3DArray, isRecursive, isColumnSorting);
        if(stringObject instanceof String[][][]) {
            string = (String[][][])stringObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(string3DArray,sortAlgoManager.getDataStructure().getStringThreeDArray());
        MatcherAssert.assertThat(string, Matchers.arrayContainingInAnyOrder(result));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideInteger2DArgumentsColumnSorting")
    public void testColumnSortInteger2DArrayWithParameters( Integer[][] integer2DArray, Integer[][] result) {
        Integer[][] integer = null;
        Object integerObject = sortAlgoManager.manageAlgo("integer2DArray", integer2DArray, isRecursive, true);
        if(integerObject instanceof Integer[][]) {
            integer = (Integer[][])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer2DArray,sortAlgoManager.getDataStructure().getIntTwoDArray());
        MatcherAssert.assertThat(integer, Matchers.arrayContaining(result));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideInteger3DArgumentsColumnSorting")
    public void testColumnSortInteger3DArrayWithParameters( Integer[][][] integer3DArray, Integer[][][] result) {
        Integer[][][] integer = null;
        Object integerObject = sortAlgoManager.manageAlgo("integer3DArray", integer3DArray, isRecursive, true);
        if(integerObject instanceof Integer[][][]) {
            integer = (Integer[][][])integerObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer3DArray,sortAlgoManager.getDataStructure().getIntThreeDArray());
        MatcherAssert.assertThat(integer, Matchers.arrayContainingInAnyOrder(integer3DArray));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideString2DArgumentsColumnSorting")
    public void testColumnSortStringArray2DWithParameters( String[][] string2DArray, String[][] result) {
        String[][] string = null;
        Object stringObject = sortAlgoManager.manageAlgo("string2DArray", string2DArray, isRecursive, true);
        if(stringObject instanceof String[][]) {
            string = (String[][])stringObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(string2DArray,sortAlgoManager.getDataStructure().getStringTwoDArray());
        MatcherAssert.assertThat(string, Matchers.arrayContainingInAnyOrder(result));
    }

    @ParameterizedTest
    @MethodSource("org.algos.sort.params.SortAlgoParamsProvider#provideString3DArgumentsColumnSorting")
    public void testColumnSortStringArray3DWithParameters( String[][][] string3DArray, String[][][] result) {
        String[][][] string = null;
        Object stringObject = sortAlgoManager.manageAlgo("string3DArray", string3DArray, isRecursive, true);
        if(stringObject instanceof String[][][]) {
            string = (String[][][])stringObject;
        }
        String dsName = sortAlgoManager.getDataStructure().getDataStructureName();
        String algoName = sortAlgoManager.getAlgoName();
        Assertions.assertEquals(SortAlgoEnum.SELECTION.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(string3DArray,sortAlgoManager.getDataStructure().getStringThreeDArray());
        MatcherAssert.assertThat(string, Matchers.arrayContainingInAnyOrder(result));
    }
}
