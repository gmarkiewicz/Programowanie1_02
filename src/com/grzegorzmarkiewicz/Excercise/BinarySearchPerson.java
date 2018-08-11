package com.grzegorzmarkiewicz.Excercise;

public class BinarySearchPerson{

    public static Integer binarySearchRec(Person[] persons, Integer value, Integer low, Integer high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (persons[mid].getAge().compareTo(value) == 1) {
            return binarySearchRec(persons, value, low, mid - 1);
        } else if (persons[mid].getAge().compareTo(value) == -1) {
            return binarySearchRec(persons, value, mid + 1, high);
        } else {
            return mid;
        }
    }
}
