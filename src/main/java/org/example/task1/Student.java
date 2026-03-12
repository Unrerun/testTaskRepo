package org.example.task1;

//Иммьютабельный класс Создай иммутабельный (неизменяемый) класс Student с полями: String name, int age, List<String> courses. Продемонстрируй его использование.
import java.util.List;
import java.util.Objects;

public final class Student {
    final String name;
    final int age;
    final List<String> courses;

    public Student(String name, int age, List<String> courses) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name is empty!");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this.name = name;
        this.age = age;
        this.courses = List.copyOf(Objects.requireNonNull(courses, "Courses cannot be null"));

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public String toString() {
        return "name " + this.name + "age = " + this.age + "courses " + courses.toString();
    }
}
