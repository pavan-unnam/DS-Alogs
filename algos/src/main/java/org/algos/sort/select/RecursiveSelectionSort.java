package org.algos.sort.select;

public class RecursiveSelectionSort {

    public static void sortingIntegerArrayWithRecursion(Integer[] intArray, int length, int index) {
        if(index==length){
            return;
        }
        int k = minIndex(intArray, length-1, index);
        if(k!=index) {
            int temp = intArray[k];
            intArray[k] = intArray[index];
            intArray[index] = temp;
        }
        sortingIntegerArrayWithRecursion(intArray, length, index+1);
    }

    private static int minIndex(Integer[] intArray, int length, int index) {
        if (index == length)
            return index;
        // Find minimum of remaining elements
        int k = minIndex(intArray, length , index + 1);
        // Return minimum of current and remaining.
        return (intArray[index] < intArray[k])? index : k;
    }


    public static void sortingStringArrayWithRecursion(String[] stringArray, int length, int index) {
        if(index==length){
            return;
        }
        int k = minStringIndex(stringArray, length-1, index);
        if(k!=index) {
            String temp = stringArray[k];
            stringArray[k] = stringArray[index];
            stringArray[index] = temp;
        }
        sortingStringArrayWithRecursion(stringArray, length, index+1);
    }

    private static int minStringIndex(String[] stringArray, int length, int index) {
        if (index == length)
            return index;
        // Find minimum of remaining elements
        int k = minStringIndex(stringArray, length , index + 1);
        // Return minimum of current and remaining.
        return (stringArray[index].compareTo(stringArray[k])) < 0? index : k;

    }


    public static void sortingInteger2DArrayWithRecursion(Integer[][] intArray, int length, int index) {
        if(index==length){
            return;
        }
        sortingIntegerArrayWithRecursion(intArray[index], intArray[index].length, 0);
        sortingInteger2DArrayWithRecursion(intArray, length, index+1);
    }


    public static void sortingInteger3DArrayWithRecursion(Integer[][][] intArray, int length, int index) {
        if(index==length){
            return;
        }
        sortingInteger2DArrayWithRecursion(intArray[index], intArray[index].length, 0);
        sortingInteger3DArrayWithRecursion(intArray, length, index+1);
    }

    public static void sortingString2DArrayWithRecursion(String[][] stringArray, int length, int index) {
        if(index==length){
            return;
        }
        sortingStringArrayWithRecursion(stringArray[index], stringArray[index].length, 0);
        sortingString2DArrayWithRecursion(stringArray, length, index+1);
    }

    public static void sortingString3DArrayWithRecursion(String[][][] stringArray, int length, int index) {
        if(index==length){
            return;
        }
        sortingString2DArrayWithRecursion(stringArray[index], stringArray[index].length, 0);
        sortingString3DArrayWithRecursion(stringArray, length, index+1);
    }
    public static void columnSorting2DIntegerArray(Integer[][] intArray, int row, int column, int noOfRows, int noOfCols) {
        if(column ==noOfCols) {
            return;
        }

        if (row == intArray.length - 1) {
            columnSorting2DIntegerArray(intArray, 0, column+1, noOfRows, noOfCols);
            return;
        }

        int minRow = findMinRow(intArray,row, column, noOfRows);
        swap(intArray, row, minRow, column);

        columnSorting2DIntegerArray(intArray, row+1, column, noOfRows, noOfCols);

    }

    public static int findMinRow(Integer[][] array, int row, int col, int numRows) {
        if (row == numRows - 1) {
            return row;
        }

        int minRow = row;
        if (array[row + 1][col] < array[minRow][col]) {
            minRow = row + 1;
        }
        return findMinRow(array, row+1, col, numRows);
    }

    public static void swap(Integer[][] array, int row1, int row2, int col) {
        int temp = array[row1][col];
        array[row1][col] = array[row2][col];
        array[row2][col] = temp;
    }
}
