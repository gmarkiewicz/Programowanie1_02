package com.grzegorzmarkiewicz.SearchAlgorithms;

import com.grzegorzmarkiewicz.SortingAlgorithms.Sorting;

public class SearchMain {
    public static void main(String[] args) {
        Integer[] array = {21, 3, 4, 51, 6, 22, 7, 39, 33, 8, 25, 1, 13, 65, 85, 41};
        Integer[] array2 = {21, 3, 4, 51, 6, 12, 7, 39, 21, 8, 2, 1, 33};

        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(8, array));
        System.out.println(linearSearch.search(1, array));
        System.out.println(linearSearch.search(100, array));
        System.out.println(middleElement(array));
        System.out.println(middleElement(array2));

        System.out.println();
        upToA(array, 4);
        System.out.println();
        upToA(array, 18);
        System.out.println();
        pastB(array2, 7);
        System.out.println();

        Sorting sorting = new Sorting();
        Integer[] sortedArray = sorting.sort(array);
        Integer[] sortedArray2 = sorting.sort(array2);
        System.out.println();

        System.out.println("index nr: " + binarySearchRec(sortedArray, 33, 0, sortedArray.length - 1));
        System.out.println("index nr: " + binarySearchIter(sortedArray2, 7));
    }

    public static Integer binarySearchRec(Integer[] array, Integer value, Integer low, Integer high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] > value) {
            return binarySearchRec(array, value, low, mid - 1);
        } else if (array[mid] < value) {
            return binarySearchRec(array, value, mid + 1, high);
        } else {
            return mid;
        }
    }

    public static Integer binarySearchIter(Integer[] array, Integer value){
        Integer low = 0;
        Integer high = array.length - 1;
        while(low <= high){
            Integer mid = (low + high) / 2;
            if(array[mid] > value){
                high = mid - 1;
            } else if (array[mid] < value){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static Integer middleElement(Integer[] array) {
        if (array.length % 2 == 0) {
            return array[array.length / 2 - 1];
        }
        return array[array.length / 2];
    }

    public static void upToA(Integer[] array, Integer a) {
        if (a < array.length && a > 0) {
            for (int i = 0; i < a; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

    public static void pastB(Integer[] array, Integer b) {
        if (b < array.length && b > 0) {
            for (int i = b; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("-1");
        }
    }
}
