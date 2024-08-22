package org.algos.search.Linear;

public class RecursiveLinearSearch {


    public static Integer searchingElementInIntegerArrayWithRecursion(Integer[] intArray, int element, int length, int index) {
        if(index==length){
            return -1;
        }
        if(intArray[index]==element) {
            return index;
        }
        return searchingElementInIntegerArrayWithRecursion(intArray, element, length, index+1);
    }


    public static Integer searchingElementInStringArrayWithRecursion(String[] stringArray, String element, int length, int index) {
        if(index==length){
            return -1;
        }
        if(stringArray[index].equals(element)) {
            return index;
        }
        return searchingElementInStringArrayWithRecursion(stringArray, element, length, index+1);
    }


    public static String searchingElementInInteger2DArrayWithRecursion(Integer[][] intArray, int element, int row, int column) {
        if(intArray[row][column]==element){
            return row+","+column;
        } else {
            if(column+1<intArray[0].length){
                return searchingElementInInteger2DArrayWithRecursion(intArray,element,row,column+1);
            } else if(row + 1<intArray.length){
               return searchingElementInInteger2DArrayWithRecursion(intArray,element,row+1,0);
            }
        }
        return "-1";
    }

    public static String searchingElementInInteger3DArrayWithRecursion(Integer[][][] intArray, int length, int index, int element) {
        String position;
        if(index==length){
            return "-1";
        } else {
            position = searchingElementInInteger2DArrayWithRecursion(intArray[index], element, 0, 0);
            if(position.equals("-1")) {
                return searchingElementInInteger3DArrayWithRecursion(intArray, length, index + 1, element);
            }
            position = index + "," + position;
        }
        return position;
    }


    public static String searchingElementInString2DArrayWithRecursion(String[][] stringArray, String element, int row, int column) {
        if(stringArray[row][column].equals(element)){
            return row+","+column;
        } else {
            if(column+1<stringArray[0].length){
                return searchingElementInString2DArrayWithRecursion(stringArray,element,row,column+1);
            } else if(row + 1<stringArray.length){
                return searchingElementInString2DArrayWithRecursion(stringArray,element,row+1,0);
            }
        }
        return "-1";
    }


    public static String searchingElementInString3DArrayWithRecursion(String[][][] stringArray, int length, int index, String element) {
        String position;
        if(index==length){
            return "-1";
        } else {
            position = searchingElementInString2DArrayWithRecursion(stringArray[index], element, 0, 0);
            if(position.equals("-1")) {
                return searchingElementInString3DArrayWithRecursion(stringArray, length, index + 1, element);
            }
            position = index + "," + position;
        }
        return position;
    }
}
