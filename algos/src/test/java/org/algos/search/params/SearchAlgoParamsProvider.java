package org.algos.search.params;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SearchAlgoParamsProvider {

    public static Stream<Arguments> provideIntegerArguments() {
        Integer [] intArray1 = {1,2,5,4,3};
        Integer [] intArray2 = {10,2,5,22,15,70,55};
        Integer [] intArray3 = {10,20,30,40,5,70,55};

        Integer result1 = 3;
        Integer result2 = 4;
        Integer result3 = 1;
        return Stream.of(
                Arguments.of(intArray1, "4", result1),
                Arguments.of(intArray2, "15", result2),
                Arguments.of(intArray3, "20", result3)
        );
    }


    public static Stream<Arguments> provideStringArguments() {
        String [] stringArray1 = {"pavan", "david","raja", "ramesh", "manu"};
        String [] stringArray2 = {"delhi", "carry","moji", "baji", "cycle", "jogery"};
        String [] stringArray3 = {"data", "position","info", "doubt"};
        return Stream.of(
                Arguments.of(stringArray1, "raja", 2),
                Arguments.of(stringArray2, "carry", 1),
                Arguments.of(stringArray3, "data", 0)
        );
    }


    public static Stream<Arguments> provideInteger2DArguments() {
        Integer [][] integer2DArray1 = {{1,2},{3,4},{5,6}};
        Integer [][] integer2DArray2 = {{1,2, 3},{5,7,8},{9,10,11}};
        Integer [][] integer2DArray3 = {{1,2,3,4},{10,20,30,40},{99,89,79,69}};
        return Stream.of(
                Arguments.of(integer2DArray1, "3", "1,0"),
                Arguments.of(integer2DArray2, "10", "2,1"),
                Arguments.of(integer2DArray3, "99", "2,0")
        );
    }


    public static Stream<Arguments> provideInteger3DArguments() {
        Integer [][][] integer3DArray1 = {{{1,2},{3,4},{5,6}}, {{7,8}, {9,10},{11,12}}};
        Integer [][][] integer3DArray2 = {{{10,29,28},{41, 45,47},{78,79,40}}, {{11,12,14}, {23,34,44},{0,1,5}}};
        Integer [][][] integer3DArray3 = {{{1,2,7,8},{11,13,15,17},{81,91,31,41}}, {{61,51,21,12}, {89,67,57,77},{80,90,20,30}}};
        return Stream.of(
                Arguments.of(integer3DArray1, "8", "1,0,1"),
                Arguments.of(integer3DArray2, "12", "1,0,1"),
                Arguments.of(integer3DArray3, "90", "1,2,1")
        );
    }


    public static Stream<Arguments> provideString2DArguments() {
        String [][] string2DArray1 = {{"danny","vetori"},{"rowdy","raja"},{"jhon","wick"}};
        String [][] string2DArray2 = {{"kumar","pavan", "dori"},{"lol","bal", "cal"},{"mate","kate","plate"}};
        String [][] string2DArray3 = {{"pot","cot","not","vote"},{"dance","steps","magic","nope"},{"no","yes","win","lose"}};
        return Stream.of(
                Arguments.of(string2DArray1, "jhon", "2,0"),
                Arguments.of(string2DArray2, "bal", "1,1"),
                Arguments.of(string2DArray3, "no", "2,0")
        );
    }

    public static Stream<Arguments> provideString3DArguments() {
        String [][][] string3DArray1 = {{{"kumar","pavan"},{"rowdy","raja"},{"jhon","wick"}}, {{"ram","ramana"},{"hanu","man"},{"spy","nam"}}};
        String [][][] string3DArray2 = {{{"sulfa","ulfa","palfa"},{"mojin","bojin", "kojin"},{"matt","patt", "satt"}}, {{"agra","boda", "mopa"},{"sal","pal", "mal"},{"spy","cpy","kpy"}}};
        String [][][] string3DArray3 = {{{"gud","bud", "mud", "nud"},{"kud","pud","sud","wood"},{"aud","bad","cad","dad"}}, {{"nut","mut","cut", "sut"},{"py","pt","ps","pd"},{"sad","pad", "mad", "nad"}}};
        return Stream.of(
                Arguments.of(string3DArray1, "wick", "0,2,1"),
                Arguments.of(string3DArray2, "matt", "0,2,0"),
                Arguments.of(string3DArray3, "py", "1,1,0")
        );
    }


    public static Stream<Arguments> provideIntegerListArguments() {
        Integer [] intArray1 = {1,2,5,4,3};
        Integer [] intArray2 = {10,2,5,22,15,70,55};
        Integer [] intArray3 = {10,20,30,40,5,70,55};
        List<Integer> integerList1 = Arrays.asList(intArray1);
        List<Integer> integerList2 = Arrays.asList(intArray2);
        List<Integer> integerList3 = Arrays.asList(intArray3);
        return Stream.of(
                Arguments.of(integerList1, "4", 3),
                Arguments.of(integerList2, "15", 4),
                Arguments.of(integerList3, "20", 1)
        );
    }


    public static Stream<Arguments> provideStringListArguments() {
        String [] stringArray1 = {"pavan", "david","raja", "ramesh", "manu"};
        String [] stringArray2 = {"delhi", "carry","moji", "baji", "cycle", "jogery"};
        String [] stringArray3 = {"data", "position","info", "doubt"};

        List<String> stringList1 = Arrays.asList(stringArray1);
        List<String> stringList2 = Arrays.asList(stringArray2);
        List<String> stringList3 = Arrays.asList(stringArray3);

        return Stream.of(
                Arguments.of(stringList1, "raja", 2),
                Arguments.of(stringList2, "carry", 1),
                Arguments.of(stringList3, "data", 0)
        );

    }


    public static Stream<Arguments> provideIntegerLinkedListArguments() {
        Integer [] intArray1 = {1,2,5,4,3};
        Integer [] intArray2 = {10,2,5,22,15,70,55};
        Integer [] intArray3 = {10,20,30,40,5,70,55};
        List<Integer> integerList1 = Arrays.asList(intArray1);
        List<Integer> integerList2 = Arrays.asList(intArray2);
        List<Integer> integerList3 = Arrays.asList(intArray3);
        return Stream.of(
                Arguments.of(integerList1, "4", 3),
                Arguments.of(integerList2, "15", 4),
                Arguments.of(integerList3, "20", 1)
        );
    }


    public static Stream<Arguments> provideStringLinkedListArguments() {
        String [] stringArray1 = {"pavan", "david","raja", "ramesh", "manu"};
        String [] stringArray2 = {"delhi", "carry","moji", "baji", "cycle", "jogery"};
        String [] stringArray3 = {"data", "position","info", "doubt"};

        List<String> stringList1 = Arrays.asList(stringArray1);
        List<String> stringList2 = Arrays.asList(stringArray2);
        List<String> stringList3 = Arrays.asList(stringArray3);

        return Stream.of(
                Arguments.of(stringList1, "raja", 2),
                Arguments.of(stringList2, "carry", 1),
                Arguments.of(stringList3, "data", 0)
        );
    }



    public static Stream<Arguments> provideStringMapArguments() {
        Map<String, String> stringMap1 = new HashMap<>();
        stringMap1.put("AP", "VIZAG");
        stringMap1.put("KA", "BENGALURU");
        stringMap1.put("TN", "CHENNAI");
        stringMap1.put("TS", "HYD");

        Map<String, String> stringMap2 = new HashMap<>();
        stringMap2.put("USA", "CA");
        stringMap2.put("UK", "BRITAN");

        Map<String, String> stringMap3 = new HashMap<>();
        stringMap3.put("dog", "bow");
        stringMap3.put("cat", "mow");
        stringMap3.put("cow", "amba");

        return Stream.of(
                Arguments.of(stringMap1, "BENGALURU", "KA"),
                Arguments.of(stringMap2, "CA", "USA"),
                Arguments.of(stringMap3, "amba", "cow")
        );
    }
}
