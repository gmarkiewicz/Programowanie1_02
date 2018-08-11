package com.grzegorzmarkiewicz.Excercise;

public class LinearSearchPersonWithDoubles{

    public Integer search(Integer value, Person[] persons, String name) {

        for(int i = 0; i < persons.length; i++){
            if(persons[i].getAge().equals(value) && persons[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
