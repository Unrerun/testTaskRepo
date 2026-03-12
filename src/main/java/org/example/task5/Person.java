package org.example.task5;

import java.util.Objects;

//Сравнение объектов
//Создай класс Person с полями name и age. Реализуй для него методы equals() и hashCode(). Отсортируй список Person сначала по возрасту (по убыванию), а при одинаковом возрасте — по имени (по алфавиту). Используй Comparator.
public class Person {
    private final String name;
    private final int age;

    Person(String name, int age) {
        if (age < 0) {
            throw new RuntimeException("Age must be positive");
        } else {
            this.age = age;
        }
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Name is null or empty!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return (age == person.age & name.equals(person.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + " Age: " + this.getAge();
    }
}
