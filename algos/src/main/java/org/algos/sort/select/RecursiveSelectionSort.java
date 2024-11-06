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
    public static void columnSorting2DIntegerArray(Integer[][] intArray) {
        sortColumns(intArray, 0);
    }

    public static void sortColumns(Integer[][] arr, int col) {
        // Base condition: If column index exceeds the number of columns, return
        if (col >= arr[0].length) {
            return;
        }
        // Sort the current column
        columnSort(arr, 0, col);
        // Recur for the next column
        sortColumns(arr, col + 1);
    }

    public static void columnSort(Integer[][] arr, int row, int col) {
        // Base condition: If row index exceeds the last row, return
        if (row >= arr.length - 1) {
            return;
        }
        // Find the index of the minimum element in the current column starting from 'row'
        int minIndex = findMinIndexInColumn(arr, row, col, row);
        // Swap the found minimum element with the element at 'row'
        if (minIndex != row) {
            int temp = arr[row][col];
            arr[row][col] = arr[minIndex][col];
            arr[minIndex][col] = temp;
        }
        // Recur for the next row in the same column
        columnSort(arr, row + 1, col);
    }

    public static int findMinIndexInColumn(Integer[][] arr, int startRow, int col, int currentMinIndex) {
        // Base case: If we've reached the last row, return the currentMinIndex
        if (startRow >= arr.length) {
            return currentMinIndex;
        }
        // Compare and update the minIndex if the current element is smaller
        if (arr[startRow][col] < arr[currentMinIndex][col]) {
            currentMinIndex = startRow;
        }
        // Recur for the next row in the column
        return findMinIndexInColumn(arr, startRow + 1, col, currentMinIndex);
    }
}
