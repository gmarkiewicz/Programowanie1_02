package com.grzegorzmarkiewicz.Excercise;

import java.util.List;

public class SortingPerson{
    public Person[] sort(Person[] person) {
        boolean loop = true;
        int j = 0;
        while (loop) {
            loop = false;
            j++;
            for (int i = 0; i < person.length - j; i++) {
                if (person[i].getAge().compareTo(person[i+1].getAge()) == 1) {
                    Person temp = person[i];
                    person[i] = person[i + 1];
                    person[i + 1] = temp;
                }
                loop = true;
            }
        }
        Person[] sorted = person;
        return sorted;
    }
}
