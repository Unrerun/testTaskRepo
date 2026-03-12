package org.example.task5;

import java.util.ArrayList;
import java.util.Comparator;

public class SortPersons {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("aboba", 54));
        persons.add(new Person("denis", 34));
        persons.add(new Person("aetrov", 34));
        persons.add(new Person("glack", 22));
        persons.add(new Person("bogdan", 8));
        persons.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName));
        System.out.println(persons);
    }
}
