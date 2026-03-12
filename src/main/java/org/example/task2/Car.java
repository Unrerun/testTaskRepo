package org.example.task2;

//Композиция vs Наследование
//Есть класс Engine (с полем power и методом start()). Спроектируй класс Car, который "имеет" двигатель (композиция), а не "является" двигателем (наследование). Класс Car должен иметь метод startCar(), который запускает двигатель.
public class Car {
    private final Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();
        System.out.println("The car is started; power == " + engine.getPower());
    }

    public Engine getEngine() {
        return engine;
    }
}