package com.grzegorzmarkiewicz.Excercise;

public class PersonSearchMain {
    public static void main(String[] args) {
        SortingPerson sorting = new SortingPerson();
        BinarySearchPerson binarySearchingPerson = new BinarySearchPerson();
        LinearSearchPerson linearSearchPerson = new LinearSearchPerson();
        LinearSearchPersonWithDoubles linearSearchPersonWithDoubles = new LinearSearchPersonWithDoubles();

        Person[] persons = new Person[6];
        persons[0] = new Person("Jan","Nowak", 35);
        persons[1] = new Person("Karol","Pawlak", 21);
        persons[2] = new Person("Robert","Kalasanty", 28);
        persons[3] = new Person("Karolina","Janik", 33);
        persons[4] = new Person("Robert","Nowak", 18);
        persons[5] = new Person("Damian","Mecha", 30);

        Integer linearSearchResult = linearSearchPerson.search(33, persons);
        System.out.println("Index nr: " + linearSearchResult + " " + persons[linearSearchResult].getName());

        Person[] sorted = sorting.sort(persons);
        Integer binarySearchResult = binarySearchingPerson.binarySearchRec(sorted, 28, 0, sorted.length-1);
        System.out.println("Index nr: " + binarySearchResult + " " + sorted[binarySearchResult].getName());

        Person[] personsDoubles = new Person[6];
        personsDoubles[0] = new Person("Jan","Nowak", 33);
        personsDoubles[1] = new Person("Karol","Pawlak", 21);
        personsDoubles[2] = new Person("Robert","Kalasanty", 28);
        personsDoubles[3] = new Person("Karolina","Janik", 33);
        personsDoubles[4] = new Person("Robert","Nowak", 18);
        personsDoubles[5] = new Person("Damian","Mecha", 33);

        Integer linearSearchWDResult = linearSearchPersonWithDoubles.search(33, personsDoubles, "Damian");
        System.out.println("Index nr: " + linearSearchWDResult + " " + personsDoubles[linearSearchWDResult].getName());
    }
}
