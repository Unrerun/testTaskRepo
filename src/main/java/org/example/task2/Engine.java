package org.example.task2;

public class Engine {
    private final int power;
    private boolean isRunning;

    public Engine(int power) {
        this.power = power;
        this.isRunning = false;
    }

    public Engine() {
        this(100);
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Engine started with power: " + power);
        }
    }

    public int getPower() {
        return power;
    }

    public boolean isRunning() {
        return isRunning;
    }
}