package org.algos.sort.params;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SortAlgoParamsProvider {


    private static Stream<Arguments> provideIntegerArguments() {
        Integer [] intArray1 = {1,2,5,4,3};
        Integer [] intArray2 = {10,2,5,22,15,70,55};
        Integer [] intArray3 = {5, 2, 15, 46, 6, 3, 8, 1};

        Integer [] result1 = {1,2,3,4,5};
        Integer [] result2 = {2,5,10,15,22,55,70};
        Integer [] result3 = {1,2,3,5,6,8,46};
        return Stream.of(
                Arguments.of(intArray1, result1),
                Arguments.of(intArray2, result2),
                Arguments.of(intArray3, result3)
        );
    }

    public static Stream<Arguments> provideStringArguments() {
        String [] stringArray1 = {"pavan", "david","raja", "ramesh", "manu"};
        String [] stringArray2 = {"delhi", "carry","moji", "baji", "cycle", "jogery"};
        String [] stringArray3 = {"data", "position","info", "doubt"};
        return Stream.of(
                Arguments.of(stringArray1, stringArray1),
                Arguments.of(stringArray2, stringArray2),
                Arguments.of(stringArray3, stringArray3)
        );
    }

    public static Stream<Arguments> provideInteger2DArguments() {
        Integer [][] integer2DArray1 = {{1,2},{4,3},{5,6}};
        Integer [][] integer2DArray2 = {{1,3, 2},{5,8,6},{9,10,11}};
        Integer [][] integer2DArray3 = {{1,4,3,2},{99,89,79,69},{10,40,30,20}};

        Integer [][] result1 = {{1,2},{3,4},{5,6}};
        Integer [][] result2 = {{1,2,3},{5,6,8},{9,10,11}};
        Integer [][] result3 = {{1,2,3,4},{10,20,30,40},{69,79,89,99}};
        return Stream.of(
                Arguments.of(integer2DArray1, result1),
                Arguments.of(integer2DArray2, result2),
                Arguments.of(integer2DArray3, result3)
        );
    }


    public static Stream<Arguments> provideInteger3DArguments() {
        Integer [][][] integer3DArray1 = {{{1,2},{3,4},{5,6}}, {{7,8}, {9,10},{11,12}}};
        Integer [][][] integer3DArray2 = {{{10,29,28},{41, 45,47},{78,79,40}}, {{11,12,14}, {23,34,44},{0,1,5}}};
        Integer [][][] integer3DArray3 = {{{1,2,7,8},{11,13,15,17},{81,91,31,41}}, {{61,51,21,12}, {89,67,57,77},{80,90,20,30}}};


        Integer [][][] result1 = {{{1,2},{3,4},{5,6}}, {{7,8}, {9,10},{11,12}}};
        Integer [][][] result2 = {{{10,28,29},{41, 45,47},{48,78,79}}, {{11,12,14}, {23,34,44},{0,1,5}}};
        Integer [][][] result3 = {{{1,2,7,8},{11,13,15,17},{31,41,81,91}}, {{12,21,51,61}, {89,67,57,77},{20,30,80,90}}};
        return Stream.of(
                Arguments.of(integer3DArray1, result1),
                Arguments.of(integer3DArray2, result2),
                Arguments.of(integer3DArray3, result3)
        );
    }


    public static Stream<Arguments> provideString2DArguments() {
        String [][] string2DArray1 = {{"danny","vetori"},{"rowdy","raja"},{"jhon","wick"}};
        String [][] string2DArray2 = {{"kumar","pavan", "dori"},{"lol","bal", "cal"},{"mate","kate","plate"}};
        String [][] string2DArray3 = {{"pot","cot","not","vote"},{"dance","steps","magic","nope"},{"no","yes","win","lose"}};
        return Stream.of(
                Arguments.of(string2DArray1, string2DArray1),
                Arguments.of(string2DArray2, string2DArray2),
                Arguments.of(string2DArray3, string2DArray3)
        );
    }

    public static Stream<Arguments> provideString3DArguments() {
        String [][][] string3DArray1 = {{{"kumar","pavan"},{"rowdy","raja"},{"jhon","wick"}}, {{"ram","ramana"},{"hanu","man"},{"spy","nam"}}};
        String [][][] string3DArray2 = {{{"sulfa","ulfa","palfa"},{"mojin","bojin", "kojin"},{"matt","patt", "satt"}}, {{"agra","boda", "mopa"},{"sal","pal", "mal"},{"spy","cpy","kpy"}}};
        String [][][] string3DArray3 = {{{"gud","bud", "mud", "nud"},{"kud","pud","sud","wood"},{"aud","bad","cad","dad"}}, {{"nut","mut","cut", "sut"},{"py","pt","ps","pd"},{"sad","pad", "mad", "nad"}}};
        return Stream.of(
                Arguments.of(string3DArray1, string3DArray1),
                Arguments.of(string3DArray2, string3DArray2),
                Arguments.of(string3DArray3, string3DArray3)
        );
    }

    public static Stream<Arguments> provideInteger2DArgumentsColumnSorting() {
        Integer [][] integer2DArray1 = {{1,2},{5,3},{4,6}};
        Integer [][] integer2DArray2 = {{1,3, 2},{5,10,6},{9,8,11}};
        Integer [][] integer2DArray3 = {{1,4,3,2},{99,89,79,69},{10,40,30,20}};

        Integer [][] result1 = {{1,2},{4,3},{5,6}};
        Integer [][] result2 = {{1,3, 2},{5,8,6},{9,10,11}};
        Integer [][] result3 = {{1,4,3,2},{10,40,30,20},{99,89,79,69}};
        return Stream.of(
                Arguments.of(integer2DArray1, result1),
                Arguments.of(integer2DArray2, result2),
                Arguments.of(integer2DArray3, result3)
        );
    }


    public static Stream<Arguments> provideInteger3DArgumentsColumnSorting() {
        Integer [][][] integer3DArray1 = {{{1,2},{5,4},{3,6}}, {{7,8}, {9,12},{11,10}}};
        Integer [][][] integer3DArray2 = {{{41, 45,47},{10,29,28},{78,79,40}}, {{11,12,14}, {23,34,44},{0,1,5}}};
        Integer [][][] integer3DArray3 = {{{1,2,7,8},{11,13,15,17},{81,91,31,41}}, {{61,51,21,12}, {89,67,57,77},{80,90,20,30}}};


        Integer [][][] result1 = {{{1,2},{3,4},{5,6}}, {{7,8}, {9,10},{11,12}}};
        Integer [][][] result2 = {{{10,29,28},{41, 45,47},{78,79,40}}, {{0,1,5},{11,12,14}, {23,34,44}}};
        Integer [][][] result3 = {{{1,2,7,8},{11,13,15,17},{81,91,31,41}}, {{61,51,20,12}, {80,67,21,30},{89,90,57,77}}};
        return Stream.of(
                Arguments.of(integer3DArray1, result1),
                Arguments.of(integer3DArray2, result2),
                Arguments.of(integer3DArray3, result3)
        );
    }


    public static Stream<Arguments> provideString2DArgumentsColumnSorting() {
        String [][] string2DArray1 = {{"danny","vetori"},{"rowdy","raja"},{"jhon","wick"}};
        String [][] string2DArray2 = {{"kumar","pavan", "dori"},{"lol","bal", "cal"},{"mate","kate","plate"}};
        String [][] string2DArray3 = {{"pot","cot","not","vote"},{"dance","steps","magic","nope"},{"no","yes","win","lose"}};
        return Stream.of(
                Arguments.of(string2DArray1, string2DArray1),
                Arguments.of(string2DArray2, string2DArray2),
                Arguments.of(string2DArray3, string2DArray3)
        );
    }

    public static Stream<Arguments> provideString3DArgumentsColumnSorting() {
        String [][][] string3DArray1 = {{{"kumar","pavan"},{"rowdy","raja"},{"jhon","wick"}}, {{"ram","ramana"},{"hanu","man"},{"spy","nam"}}};
        String [][][] string3DArray2 = {{{"sulfa","ulfa","palfa"},{"mojin","bojin", "kojin"},{"matt","patt", "satt"}}, {{"agra","boda", "mopa"},{"sal","pal", "mal"},{"spy","cpy","kpy"}}};
        String [][][] string3DArray3 = {{{"gud","bud", "mud", "nud"},{"kud","pud","sud","wood"},{"aud","bad","cad","dad"}}, {{"nut","mut","cut", "sut"},{"py","pt","ps","pd"},{"sad","pad", "mad", "nad"}}};
        return Stream.of(
                Arguments.of(string3DArray1, string3DArray1),
                Arguments.of(string3DArray2, string3DArray2),
                Arguments.of(string3DArray3, string3DArray3)
        );
    }

    public static Stream<Arguments> provideListIntegerArguments() {
        Integer [] intArray1 = {1,2,5,4,3};
        Integer [] intArray2 = {10,2,5,22,15,70,55};
        Integer [] intArray3 = {10,20,30,40,5,70,55};
        List<Integer> integerList1 = Arrays.asList(intArray1);
        List<Integer> integerList2 = Arrays.asList(intArray2);
        List<Integer> integerList3 = Arrays.asList(intArray3);
        return Stream.of(
                Arguments.of(integerList1, integerList1),
                Arguments.of(integerList2, integerList2),
                Arguments.of(integerList3, integerList3)
        );
    }

    public static Stream<Arguments> provideStringIntegerArguments() {
        String [] stringArray1 = {"pavan", "david","raja", "ramesh", "manu"};
        String [] stringArray2 = {"delhi", "carry","moji", "baji", "cycle", "jogery"};
        String [] stringArray3 = {"data", "position","info", "doubt"};

        List<String> stringList1 = Arrays.asList(stringArray1);
        List<String> stringList2 = Arrays.asList(stringArray2);
        List<String> stringList3 = Arrays.asList(stringArray3);
        return Stream.of(
                Arguments.of(stringList1, stringList1),
                Arguments.of(stringList2, stringList2),
                Arguments.of(stringList3, stringList3)
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
                Arguments.of(stringMap1, stringMap1),
                Arguments.of(stringMap2, stringMap2),
                Arguments.of(stringMap3, stringMap3)
        );
    }
}
