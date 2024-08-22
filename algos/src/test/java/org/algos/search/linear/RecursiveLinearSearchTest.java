package org.algos.search.linear;

import org.algos.builder.AlgorithmBuilder;
import org.algos.builder.SearchAlgorithmBuilder;
import org.algos.enums.DataStructureEnum;
import org.algos.enums.SearchAlgoEnum;
import org.algos.factory.AlgoFactory;
import org.algos.generator.AlgoGenerator;
import org.algos.generator.SearchAlgoManager;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;

public class RecursiveLinearSearchTest {
    static SearchAlgoManager searchAlgoManager;
    Boolean isRecursive=true;

    @BeforeAll
    static void setup() {
        AlgoFactory algoFactory = AlgoGenerator.toGetAlgorithm("search");
        AlgorithmBuilder algorithmBuilder = algoFactory.getAlgorithm("LINEAR");
        if(algorithmBuilder instanceof SearchAlgorithmBuilder) {
            searchAlgoManager = new SearchAlgoManager((SearchAlgorithmBuilder) algorithmBuilder);
        }
    }

    @Test
    public void testIntegerArraySearchElement() {
        Integer integer = null;
        Integer [] intArray = {1,2,3,4,5};
        Object integerObject = searchAlgoManager.manageAlgo("integerArray", intArray, "4", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(3,integer);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_ARRAY.name(),dsName);
        Assertions.assertEquals(intArray,searchAlgoManager.getDataStructure().getIntArray());
    }

    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideIntegerArguments")
    public void testSearchIntegerArrayWithParameters( Integer[] intArray, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("integerArray", intArray, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_ARRAY.name(),dsName);
        Assertions.assertEquals(intArray,searchAlgoManager.getDataStructure().getIntArray());
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }


    @Test
    public void testStringArraySearchElement() {
        Integer integer = null;
        String [] stringArray = {"pavan", "david","raja", "ramesh", "manu"};
        Object integerObject = searchAlgoManager.manageAlgo("stringArray", stringArray, "raja", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(2,integer);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_ARRAY.name(),dsName);
        Assertions.assertEquals(stringArray,searchAlgoManager.getDataStructure().getStringArray());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideStringArguments")
    public void testSearchStringArrayWithParameters(String[] stringArray, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("stringArray", stringArray, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_ARRAY.name(),dsName);
        Assertions.assertEquals(stringArray,searchAlgoManager.getDataStructure().getStringArray());
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }

    @Test
    public void testInteger2DArraySearchElement() {
        String string = null;
        Integer [][] integer2DArray = {{1,2},{3,4},{5,6}};
        Object stringObject = searchAlgoManager.manageAlgo("integer2DArray", integer2DArray, "4", isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals("1,1",string);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer2DArray,searchAlgoManager.getDataStructure().getIntTwoDArray());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideInteger2DArguments")
    public void testSearchInteger2DArrayWithParameters( Integer[][] int2DArray, String param, String result) {
        String string = null;
        Object stringObject = searchAlgoManager.manageAlgo("integer2DArray", int2DArray, param, isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(int2DArray,searchAlgoManager.getDataStructure().getIntTwoDArray());
        MatcherAssert.assertThat(string, Matchers.equalTo(result));
    }

    @Test
    public void testInteger3DArraySearchElement() {
        String string = null;
        Integer [][][] integer3DArray = {{{1,2},{3,4},{5,6}}, {{7,8}, {9,10},{11,12}}};
        Object stringObject = searchAlgoManager.manageAlgo("integer3DArray", integer3DArray, "8", isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals("1,0,1",string);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(integer3DArray,searchAlgoManager.getDataStructure().getIntThreeDArray());
    }

    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideInteger3DArguments")
    public void testInteger3DArraySearchElementWithParams(Integer[][][] int3DArray, String param, String result) {
        String string = null;
        Object stringObject = searchAlgoManager.manageAlgo("integer3DArray", int3DArray, param, isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(int3DArray,searchAlgoManager.getDataStructure().getIntThreeDArray());
        MatcherAssert.assertThat(string, Matchers.equalTo(result));
    }

    @Test
    public void testString2DArraySearchElement() {
        String string = null;
        String [][] string2DArray = {{"kumar","pavan"},{"rowdy","raja"},{"jhon","wick"}};
        Object stringObject = searchAlgoManager.manageAlgo("string2DArray", string2DArray, "raja", isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals("1,1",string);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(string2DArray,searchAlgoManager.getDataStructure().getStringTwoDArray());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideString2DArguments")
    public void testSearchString2DArrayWithParameters( String[][] string2DArray, String param, String result) {
        String string = null;
        Object stringObject = searchAlgoManager.manageAlgo("string2DArray", string2DArray, param, isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_2D_ARRAY.name(),dsName);
        Assertions.assertEquals(string2DArray,searchAlgoManager.getDataStructure().getStringTwoDArray());
        MatcherAssert.assertThat(string, Matchers.equalTo(result));
    }


    @Test
    public void testString3DArraySearchElement() {
        String string = null;
        String [][][] string3DArray = {{{"kumar","pavan"},{"rowdy","raja"},{"jhon","wick"}}, {{"ram","ramana"},{"hanu","man"},{"spy","nam"}}};
        Object stringObject = searchAlgoManager.manageAlgo("string3DArray", string3DArray, "ramana", isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals("1,0,1",string);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(string3DArray,searchAlgoManager.getDataStructure().getStringThreeDArray());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideString3DArguments")
    public void testSearchString3DArrayWithParameters( String[][][] string3DArray, String param, String result) {
        String string = null;
        Object stringObject = searchAlgoManager.manageAlgo("string3DArray", string3DArray, param, isRecursive);
        if(stringObject instanceof String) {
            string = (String)stringObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_3D_ARRAY.name(),dsName);
        Assertions.assertEquals(string3DArray,searchAlgoManager.getDataStructure().getStringThreeDArray());
        MatcherAssert.assertThat(string, Matchers.equalTo(result));
    }


    @Test
    public void testIntegerListSearchElement() {
        Integer integer = null;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(6);
        integerList.add(7);
        integerList.add(5);
        Object integerObject = searchAlgoManager.manageAlgo("integerList", integerList, "5", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(3,integer);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_LIST.name(),dsName);
        Assertions.assertEquals(integerList,searchAlgoManager.getDataStructure().getIntList());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideIntegerListArguments")
    public void testIntegerListSearchElementParams(List<Integer> integerList, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("integerList", integerList, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.INTEGER_LIST.name(),dsName);
        Assertions.assertEquals(integerList,searchAlgoManager.getDataStructure().getIntList());
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }


    @Test
    public void testStringListSearchElement() {
        Integer integer = null;
        List<String> stringList = new ArrayList<>();
        stringList.add("pavan");
        stringList.add("raja");
        stringList.add("kumar");
        stringList.add("river");
        Object integerObject = searchAlgoManager.manageAlgo("stringList", stringList, "river", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(3,integer);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_LIST.name(),dsName);
        Assertions.assertEquals(stringList,searchAlgoManager.getDataStructure().getStringList());
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideStringListArguments")
    public void testStringListSearchElementWithParams(List<String> stringList, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("stringList", stringList, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_LIST.name(),dsName);
        Assertions.assertEquals(stringList,searchAlgoManager.getDataStructure().getStringList());
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }


    @Test
    public void testIntegerLinkedListSearchElement() {
        Integer integer = null;
        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(1);
        integerLinkedList.add(6);
        integerLinkedList.add(7);
        integerLinkedList.add(5);
        Object integerObject = searchAlgoManager.manageAlgo("integerLinkedList", integerLinkedList, "5", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        Assertions.assertEquals(3,integer);
    }


    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideIntegerLinkedListArguments")
    public void testIntegerLinkedListSearchElementWithParams(List<Integer> integerLinkedList, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("integerLinkedList", integerLinkedList, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }

    @Test
    public void testStringLinkedListSearchElement() {
        Integer integer = null;
        List<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("pavan");
        stringLinkedList.add("raja");
        stringLinkedList.add("kumar");
        stringLinkedList.add("river");
        Object integerObject = searchAlgoManager.manageAlgo("stringLinkedList", stringLinkedList, "river", isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        Assertions.assertEquals(3,integer);
    }

    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideStringLinkedListArguments")
    public void testStringLinkedListSearchElementWithParams(List<String> stringLinkedList, String param, Integer result) {
        Integer integer = null;
        Object integerObject = searchAlgoManager.manageAlgo("stringLinkedList", stringLinkedList, param, isRecursive);
        if(integerObject instanceof Integer) {
            integer = (Integer)integerObject;
        }
        MatcherAssert.assertThat(integer, Matchers.equalTo(result));
    }



    @Test
    public void testStringMapSearchElement() {
        String key = null;
        Map<String, String> stringMap= new HashMap<>();
        stringMap.put("AP", "VIZAG");
        stringMap.put("KA", "BENGALURU");
        stringMap.put("TN", "CHENNAI");
        stringMap.put("TS", "HYD");
        Object object = searchAlgoManager.manageAlgo("stringMap", stringMap, "HYD", isRecursive);
        if(object instanceof String) {
            key = (String)object;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals("TS",key);
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_MAP.name(),dsName);
        Assertions.assertEquals(stringMap,searchAlgoManager.getDataStructure().getStringMap());
    }

    @ParameterizedTest
    @MethodSource("org.algos.search.params.SearchAlgoParamsProvider#provideStringMapArguments")
    public void testStringMapSearchElementWithParams(Map<String, String> stringMap, String param, String result) {
        String key = null;
        Object object = searchAlgoManager.manageAlgo("stringMap", stringMap, param, isRecursive);
        if(object instanceof String) {
            key = (String)object;
        }
        String dsName = searchAlgoManager.getDataStructure().getDataStructureName();
        String algoName = searchAlgoManager.getAlgoName();
        Assertions.assertEquals(SearchAlgoEnum.LINEAR.name(),algoName);
        Assertions.assertEquals(DataStructureEnum.STRING_MAP.name(),dsName);
        Assertions.assertEquals(stringMap,searchAlgoManager.getDataStructure().getStringMap());
        MatcherAssert.assertThat(key, Matchers.equalTo(result));
    }
}
