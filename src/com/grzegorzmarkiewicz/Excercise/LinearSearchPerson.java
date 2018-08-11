package com.grzegorzmarkiewicz.Excercise;

public class LinearSearchPerson{
    public Integer search(Integer value, Person[] persons) {
        for(int i = 0; i < persons.length; i++){
            if(persons[i].getAge().equals(value)){
                return i;
            }
        }
        return -1;
    }
}
